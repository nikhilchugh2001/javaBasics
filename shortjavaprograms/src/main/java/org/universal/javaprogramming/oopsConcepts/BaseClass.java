package org.universal.javaprogramming.oopsConcepts;

public class BaseClass {
	
	static int i=0;
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    
    
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
        BaseClass.foo();
        BaseClass.foo(10);
        InheritedClass.loo();
    }
    
    
    
}


class InheritedClass extends BaseClass {
	
	 public static void loo() {
		 foo();
		 //i=12;
	        System.out.println("Inhertied.foo() called "+i);
	    }
	
}