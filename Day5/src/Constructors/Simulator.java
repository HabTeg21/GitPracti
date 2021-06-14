package Constructors;

public class Simulator {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Bobby", 2);
		dog1.bark();
		System.out.println("Dog name " + dog1.name + " Dog age " + dog1.age );
		
		Dog dog2 = new Dog("my dog", 11.4);
		System.out.println("Dog 2 name: " + dog2.name + "\nDog 2 breed: " + 
		dog2.breed + "\nDog 2 age: " + dog2.age + "\nDog 2 weight: " +  dog2.weight);
		System.out.print("Dog 2 bark: ");
		dog2.bark();
		
		String sentence = "My name is Habtamu Tegegne";
		String[] words = sentence.split(" ");
		//String[] words = sentence.split("e");
		for (String w : words)
		{
			System.out.println(w);
		}
		
	}

}
