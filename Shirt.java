/**
* <h1>Shirt</h1>
* The program implements an application that
* simply demonstrates the constructor overloading and encapsulation concept
* for all the private members setters and getters have been created and 3 constructors have been 
* created to initialize the object
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/
package session2;

public class Shirt {
	
	private int collarSize;//As discussed with support team can use non static variable
	private int sleeveLength;
	private String shirtMaterial;
	
	public Shirt() {
		collarSize = 20;
		sleeveLength = 15;
		shirtMaterial = "Cotton";	
	}

	public Shirt(int collarSize, int sleeveLength) {
		this.collarSize = collarSize;
		this.sleeveLength = sleeveLength;
		this.shirtMaterial = "Cotton";
	}
	
	public Shirt(int collarSize, int sleeveLength,String shirtMaterial) {
		this.collarSize = collarSize;
		this.sleeveLength = sleeveLength;
		this.shirtMaterial = shirtMaterial;
	}

	public int getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(int collarSize) {
		this.collarSize = collarSize;
	}

	public int getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(int sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getShirtMaterial() {
		return shirtMaterial;
	}

	public void setShirtMaterial(String shirtMaterial) {
		this.shirtMaterial = shirtMaterial;
	}

	public static void main(String[] args) {
		Shirt sh1 = new Shirt();
		System.out.println("The material is " + sh1.shirtMaterial);

	}

}
