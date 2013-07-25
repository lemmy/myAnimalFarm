class Dog {

	Dog(String aName) {
		name = aName;
	}

	String name;
	int calories;

	public String bark() {
		return "Wuff Wuff";
	}

	void feed(Food food) {
		calories = calories + food.getCalories();
	}
}
