package This_Super_Keyword;

class Super_Keyword {
	// Super Keyword is a reference variable that is used to refer to parent class
	// when working with objects.
	// Super came into picture when working with the concept of inheritance.

	// Advantages of super Keyword
	// 1.Allows reuse of code: Using the super keyword allows subclasses to inherit
	// functionality from their parent class, which promote the reuse of the code
	// and reduces the duplication
	// 2.Supports Polymorphism :Because subclasses can override methods and access
	// fields from their parent classes, using super Polymorphism is possible
	// 3. Facilitates abstraction and Encapsulation : The use of super promotes
	// encapsulation and abstraction by allowing subclass to focus on their behavior
	// while relying on the parent class to handle lower-level details.
	
	public static void main(String[] args) {
		car small = new car();
		small.display();
	}
}

class Vehicle {
	int maxSpeed = 180;
}

class car extends Vehicle {
	int maxSpeed = 180;

	void display() {
		System.out.println("Maximum Speed :" + super.maxSpeed);
	}

}
