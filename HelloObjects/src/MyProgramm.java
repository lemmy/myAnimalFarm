class MyProgramm {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Waldo");

		// Print the instance's name
		System.out.println(dog1.name);

		// Dogs can bark
		System.out.println(dog1.bark());

		// Dogs need food (lets feed the dog)
		dog1.feed(new Apple());
		dog1.feed(new Potato());
		dog1.feed(new Beef());

		dog1.feed(new Food(10));

		System.out.println("Dog " + dog1.name + " has eaten calories: "
				+ dog1.getCalories());

		// call by value
		int calories = 23;
		Apple apple = new Apple(calories);
		calories = 42;
		System.out.println(apple.getCalories()); // Is the answer 23 or 42?

		// call by reference
		apple = new Apple(23);
		Dog rex = new Dog("Rex");
		rex.feed(apple);
		apple.calories = 42;
		Food eaten = rex.hasEaten();
		System.out.println(eaten.getCalories()); // Is the answer 23 or 42?
	}
}
