package com.techie.java;

//creating a class
class Test
{
	//this is normal non static method
	public void totalSum() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("the total sum is: " +sum );
	}
	// static method
	public static void totalValue()
	{
		int a,b,value;
		a=30;
		b=70;
		value=b-a;
		System.out.println(" the total value is: " + value);
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		//for non static methods we nee to call them using by creation of its object
		Test t1=new Test();
		t1.totalSum();
		
		// for static methods we no need to create a object,
		//we can directly call the method by its class name
		Test.totalValue();
		
	}

}
