package Constructors;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;
	
	public Dog(String name, String breed, int age, double weight)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
	//The this keyword invokes the above constructor
	public Dog(String name, double weight) {
		this(name, "local", 5, weight);
	}
	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void bark()
	{
		System.out.println("woof woof");
	}
	
}
