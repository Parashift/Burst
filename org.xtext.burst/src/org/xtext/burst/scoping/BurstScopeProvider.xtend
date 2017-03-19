/*
 * generated by Xtext 2.11.0
 */
package org.xtext.burst.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.burst.burst.Block
import org.xtext.burst.burst.BurstPackage
import org.xtext.burst.burst.Concern
import org.xtext.burst.burst.Intersection
import org.xtext.burst.validation.ConcernExtensions
import org.xtext.burst.burst.Locale
import java.util.List
import java.util.ArrayList
import org.xtext.burst.burst.Line
import org.xtext.burst.burst.Call

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */

class BurstScopeProvider extends AbstractBurstScopeProvider {
	
	extension ConcernExtensions c = new ConcernExtensions ();
		
	val pack = BurstPackage.eINSTANCE
	
	

	override getScope(EObject context, EReference reference) {
		return switch (reference){
			case pack.access_Name:
				getScopeForVariableFrom(context)
			default : super.getScope(context, reference)
		}
	}
	
	def IScope getScopeForVariableFrom(EObject context) {
		val container = context.eContainer
		return switch(container) {
			Concern: 
				Scopes.scopeFor((container as Concern).members)
			Intersection: 
				Scopes.scopeFor((container as Intersection).variables, getScopeForVariableFrom(container))
			Block: 
				Scopes.scopeFor((container as Block).localesBefore(context), 
					getScopeForVariableFrom(container)
				)
			default: getScopeForVariableFrom(container)
		}
	}
	
	
	
	
}