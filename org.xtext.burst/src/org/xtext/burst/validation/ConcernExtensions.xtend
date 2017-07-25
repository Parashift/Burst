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
import org.xtext.burst.burst.BPackage
import com.google.common.collect.HashMultimap
import org.xtext.burst.burst.Parameter
import org.xtext.burst.burst.Access

class ConcernExtensions {

	def	List<BPackage> getPackage(File f) {
		val list =  new ArrayList<BPackage>();
		for (EObject p : f.eContents) {
			if(p instanceof BPackage) {
				list.add(p)
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
	
	def	List<Concern> getConcerns(BPackage p) {
		val list =  new ArrayList<Concern>();
		for (EObject i : p.eContents) {
			if(i instanceof Concern) {
				list.add(i)
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
	
	def	List<Variable> getVariables(File f) {
		val list =  new ArrayList<Variable>();
		for(c: f.concerns) {
			list.add(c)
			list.addAll(c.variables)	
		}		
		return list;
	}
	
	def void setVariablesInMap(BPackage p, HashMultimap<String, Variable> multimap){
		val list =  new ArrayList<Variable>();
		for(c: p.concerns) {
			multimap.put(c.name, c)
			c.setVariablesInMap(multimap)
		}			
	}
	
	def	List<Variable> getVariables(BPackage p) {
		val list =  new ArrayList<Variable>();
		for(c: p.concerns) {
			list.add(c)
			list.addAll(c.variables)	
		}		
		return list;
	}
	
	def void setVariablesInMap(Concern c, HashMultimap<String, Variable> multiMap){
		for(m: c.members) {
			multiMap.put(m.name, m)
		}			
		for(i: c.intersections) {
			i.setVariablesInMap(multiMap)
			i.block.setVariablesInMap(multiMap)
		}		
	}
	
	def	List<Variable> getVariables(Concern c) {
		val list =  new ArrayList<Variable>();
		for(m: c.members) {
			list.add(m)
		}			
		for(i: c.intersections) {
			list.addAll(i.variables)	
			list.addAll(i.block.locales)	
		}		
		return list;
	}
	
	def void setVariablesInMap(Intersection i, HashMultimap<String, Variable> multiMap){
		for(p: i.params) {
			multiMap.put(p.name, p)
		}			
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
	
	def void setVariablesInMap(Block b, HashMultimap<String, Variable> multiMap){
		for (Line li : b.lines) {
			for(EObject e : li.eContents) {
				switch(e) {
				Locale:
					multiMap.put(e.name, e)
				Call:
					for(Locale l:getLocales(e as Call)) {
						multiMap.put(l.name, l)
					}
				}
			}
		}		
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
	
	def Concern getConcern(Variable v){

		switch(v) {
			Member :return (v as Member).concern
			Concern : return (v as Concern)
			Locale : (v as Locale).type
			Parameter : (v as Parameter).type
			default : return null
		}
	}
	def Concern getConcern(Access v){
		if(v.name instanceof Variable) {
			return (v.name as Variable).concern
		}
		if(v.base instanceof Concern) {
			return v.base as Concern
		}
		if(v.base instanceof Access) {
			return v.base.concern
		}
		return null;
	}
}
	


