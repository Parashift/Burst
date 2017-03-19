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

@RunWith(XtextRunner)
@InjectWith(BurstInjectorProvider)
public class BurstValidatorTest {

	@Inject extension ParseHelper<File>parseHelper
	@Inject extension ValidationTestHelper
	
	@Test
	def void testDetectMissingRef() {
		'''
		package A {
			concern B {
				C param1
			}
		}'''.parse.assertError(BurstPackage.eINSTANCE.member, "org.eclipse.xtext.diagnostics.Diagnostic.Linking", "Couldn't resolve reference to Concern 'C'.")			
	}
	
	@Test
	def void testDetectHyerarchyCycle1() {
		'''
		package A {
			concern B {
				is B param1
			}
		}'''.parse.assertError(BurstPackage.eINSTANCE.member, BurstValidator.HIERARCHY_CYCLE, "Cycle in hierarchy of entity B")			
	}
	
	@Test
	def void testDetectHyerarchyCycle2() {
		'''
		package A {
			concern B {
				is B param1
			}
			concern C {
				is C param2
			}
		}'''.parse => [
			assertError(BurstPackage.eINSTANCE.member, BurstValidator.HIERARCHY_CYCLE, "Cycle in hierarchy of entity B")			
			assertError(BurstPackage.eINSTANCE.member, BurstValidator.HIERARCHY_CYCLE, "Cycle in hierarchy of entity C")			
		]
	}
	@Test
	def void testDetectHyerarchyCycle3() {
		'''
		package A {
			concern B {
				is C param1
			}
			concern C {
				is B param2
			}
		}'''.parse => [
			assertError(BurstPackage.eINSTANCE.member, BurstValidator.HIERARCHY_CYCLE, "Cycle in hierarchy of entity B")			
			assertError(BurstPackage.eINSTANCE.member, BurstValidator.HIERARCHY_CYCLE, "Cycle in hierarchy of entity C")			
		]
	}
	
}
	
