package com.bridgelabz;




class One
{
	public void display()
	{
		System.out.println("Hello");
	}
}
class Two extends One
{
	public void display()
	{
		System.out.println("Hi");
	}
	public int add(int x , int y)
	{
		return x+y;
	}
	public double add(double x , double y)
	{
		return x+y;
	}
}
class EncapsulationTest
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
}
abstract class Bike
{
	public abstract void run();
}
class TVS extends Bike
{
	public void run()
	{
		System.out.println("Bike is Running.");
	}
}

public class OOPSConcept 
{
	
	public static void main(String[] args) 
	{
		One a = new One();
		a.display();
		Two b = new Two();
		b.display();
		System.out.println(b.add(5, 0));
		System.out.println(b.add(1.2, 13));
		EncapsulationTest encap = new EncapsulationTest();
		encap.setName("Nethaji");
		System.out.println(encap.getName());
		Bike test = new TVS();
		test.run();
	}

}
