package week9b;

public class Cat {
	String breed;
	String Siz;
	String color;
	int age;
	
	
	void data() {
		System.out.println("breed:"+breed);
		System.out.println("Siz:"+Siz);
		System.out.println("color:"+color);
		System.out.println("age:"+age);
		
	}
	void eat() {
		System.out.println("===========");
		System.out.println("Cat of Eat Fish");
		
	}
	
	void run() {
		System.out.println("===========");
		System.out.println("Cat of Run Kill Rat");
		
	}
	
	void sleep() {
		System.out.println("============");
		System.out.println("Cat of sleepping");
	}
	
	void looking() {
		System.out.println("============");
		System.out.println("Cat of looking for");

		
	}
	
	public static void main(String[]args) {
		
		Cat Luca = new Cat();
		Luca.breed="Thai";
		Luca.Siz="Fat";
		Luca.color="red";
		Luca.age=10;
		
		Luca.data();
		Luca.eat();
		Luca.run();
		Luca.sleep();
		Luca.looking();
		
	}
}
