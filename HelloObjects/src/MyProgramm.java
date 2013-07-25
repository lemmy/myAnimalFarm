class MyProgramm {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Waldo");

		// Print the instance's name
		System.out.println(dog1.name);

		// Dogs can bark
		System.out.println(dog1.bark());

		// Dogs need food (lets feed the dog)
		dog1.feed(new Food(10));
	}
}
