package java_20200519;

import java.lang.*;

public class SuperDemo extends Object {
	public SuperDemo() {
		super();
	}
}

class A extends Object {
	A(int a) {
		super();
	}

	A() {
		super();
	}
}

class B extends A {
	B() {
		super();
	}
}
/*
 * class A extends Object{ A(){ super(); } }
 * 
 * class B extends A { B(){ super(); } }
 */