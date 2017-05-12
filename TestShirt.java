/**
* <h1>Test Shirt</h1>
* The program implements an application that
* simply demonstrates the constructor overloading concept
* 3 constructors have been created and values initialized through them have been printed
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/
package session2;

public class TestShirt {

	public static void main(String[] args) {
		
		Shirt sh1 = new Shirt();
		Shirt sh2 = new Shirt(10,20);
		Shirt sh3 = new Shirt(20,30,"Silk");
		TestShirt ts = new TestShirt();
		ts.print1(sh1);// calling default constructor
		ts.print2(sh2);// calling 2 parameter constructor
		ts.print3(sh3);// calling 3 parameter constructor
	}

	
	public void print1(Shirt o){
		System.out.println("Default constructor");
		System.out.print("The shirt material is " + o.getShirtMaterial());	
		System.out.print(" :: The collar size is " + o.getCollarSize());
		System.out.println(" :: The sleeve length is " + o.getSleeveLength());
	}
	
	public void print2(Shirt o){
		System.out.println("Two parameter constructor");
		System.out.print("The shirt material is " + o.getShirtMaterial());	
		System.out.print(" :: The collar size is " + o.getCollarSize());
		System.out.println(" :: The sleeve length is " + o.getSleeveLength());
	}
	
	public void print3(Shirt o){
		System.out.println("Three parameter constructor");
		System.out.print("The shirt material is " + o.getShirtMaterial());	
		System.out.print(" :: The collar size is " + o.getCollarSize());
		System.out.println(" :: The sleeve length is " + o.getSleeveLength());
	}
}
