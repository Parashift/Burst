package org.xtext.burst.validation

import org.xtext.burst.burst.Member
import java.util.List
import org.xtext.burst.burst.Concern
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.xtext.burst.burst.File
import org.xtext.burst.burst.Locale
import org.xtext.burst.burst.Block
import org.xtext.burst.burst.Variable
import org.xtext.burst.burst.Intersection
import org.xtext.burst.burst.Line
import org.xtext.burst.burst.Call

class ConcernExtensions {

	def	List<Concern> getPackage(File f) {
		val list =  new ArrayList<Concern>();
		for (EObject p : f.eContents) {
			if(p instanceof org.xtext.burst.burst.Package) {
				for (EObject c : p.elements) {
					if(c instanceof Concern) {
						list.add(c)
					}
				}
			}
		}
		return list;
	}
	
	def	List<Member> getMembers(Concern c) {
		val list =  new ArrayList<Member>();
		for (EObject i : c.eContents) {
			if(i instanceof Member) {
				list.add(i)
			}
		}
		return list;
	}
	
	def List<Intersection> getIntersections(Concern concern) {
		val list =  new ArrayList<Intersection>();
		for (EObject i : concern.eContents) {
			if(i instanceof Intersection) {
				list.add(i)
			}
		}
		return list;
		
	}
	def	List<Concern> getConcerns(File f) {
		val list =  new ArrayList<Concern>();
		for (EObject p : f.eContents) {
				for (EObject i : p.eContents) {
					if(i instanceof Concern) {
						list.add(i)
					}
				}
			
		}
		return list;
	}
	
	def List<Line> getLines(Intersection intersection) {
		val list =  new ArrayList<Line>();
		if(intersection != null && intersection.block != null){
			for (EObject obj : intersection.block.eContents) {
				if(obj instanceof Line) {
					list.add(obj)
				}
			}
		}
		return list;
	}
	
	def	List<Variable> getVariables(Intersection i) {
		val list =  new ArrayList<Variable>();
		list.addAll(i.params)
		return list;
	}
	
	def	List<Locale> getLocales(Call c) {
		val list =  new ArrayList<Locale>();
		for(EObject eb : c.eContents) {
			if(eb instanceof Locale){
				list.add(eb)
			}			
			if(eb instanceof Call){
				list.addAll(getLocales(eb))
			}
		}
		return list;
	}
	
	def	List<Locale> getLocales(Block b) {
		val list =  new ArrayList<Locale>();
		for (Line l : b.lines) {
			for(EObject e : l.eContents) {
				switch(e) {
				Locale:
					list.add(e as Locale)
				Call:
					list.addAll(getLocales(e as Call))
				}
			}
		}
		return list;
	}
	
	def List<Locale> localesBefore(Block block, EObject context) {
		val list =  new ArrayList<Locale>();
		for (Line l : block.lines) {
			if(l == context) {
				return list
			}
			switch(l) {
			Locale:
				list.add(l)
			Call:
				list.addAll(getLocales(l))
			}
		}
		return list;
	}	
	
}
	


