package org.xtext.burst.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.burst.burst.File
import org.junit.Test
import org.xtext.burst.burst.BurstPackage
import org.xtext.burst.validation.BurstValidator
import org.xtext.burst.validation.ConcernExtensions
import org.xtext.burst.burst.Concern
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EObject
import org.xtext.burst.burst.Intersection
import org.junit.Assert
import org.xtext.burst.scoping.BurstScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.IScopeProvider

@RunWith(XtextRunner)
@InjectWith(BurstInjectorProvider)
public class BurstScopingTest {

	@Inject extension ParseHelper<File>parseHelper
	@Inject extension IScopeProvider
	
	extension ConcernExtensions c = new ConcernExtensions ();
	
	@Test
	def void testDetectVariableScope() {
		'''
		package A {
			concern B {
				A externalParam1
				when A parameter {
					new A firstLocale
					premier (new A secondeLocale)
					new A afterLocale
				}
				A externalParam2
			}
		}'''.parse.concerns.last.intersections.head.lines.last => 
		[ 	assertScope(it, BurstPackage.eINSTANCE.access_Name, "firstLocale, secondeLocale, parameter, externalParam1, externalParam2")
		]
	
	}
		@Test
	def void testDetectScopeInterBlocks() {
		'''
		package A {
			concern B {
				A externalParam1
				when A parameter {
					new A firstLocale
					premier (new A secondeLocale)
					{	{
							new A interOfBlock
						}
						if premier {
							new A variableIf
						} else {
							new A variableElse
						}
					}
					new A afterLocale
				}
				A externalParam2
			}
		}'''.parse.concerns.last.intersections.head.lines.last => 
		[ 	assertScope(it, BurstPackage.eINSTANCE.access_Name, "firstLocale, secondeLocale, parameter, externalParam1, externalParam2")
		]
	
	}
	
	
	def private assertScope(EObject context, EReference reference, CharSequence expected){
		Assert.assertEquals(expected.toString,context.getScope(reference).allElements.map[name].join(", "))
	}
	
	
	
}
	
