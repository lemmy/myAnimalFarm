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
	}
}
