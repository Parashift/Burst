package org.xtext.burst.ast;

import org.xtext.burst.burst.Intersection;
import org.xtext.burst.burst.impl.BurstFactoryImpl;

public class BurstFactoryImplExt extends BurstFactoryImpl {

	@Override
	public Intersection createIntersection() {
		return new IntersectionImplExt();
	}
}
