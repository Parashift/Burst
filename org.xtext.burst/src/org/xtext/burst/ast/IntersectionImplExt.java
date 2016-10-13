package org.xtext.burst.ast;

import org.xtext.burst.burst.Parameter;
import org.xtext.burst.burst.Variable;
import org.xtext.burst.burst.impl.IntersectionImpl;

public class IntersectionImplExt extends IntersectionImpl {
	public String getName() {
		String newName = "lol";
		for( Variable var : getParams()) {
			if(var instanceof Parameter) {
				newName += ((Parameter) var).getName() + " ";
			}
			if(var instanceof Parameter) {
				newName += ((Parameter) var).getName() + " ";
			}
		}
		return newName;
	};
}
