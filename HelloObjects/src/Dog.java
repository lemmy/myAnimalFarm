class Dog {

	Dog(String aName) {
		name = aName;
	}

	String name;
	int calories;
	Food food;

	String bark() {
		return "Wuff Wuff";
	}

	void feed(Food aFood) {
		food = aFood;
		calories = calories + aFood.getCalories();
	}

	int getCalories() {
		return calories;
	}

	Food hasEaten() {
		return food;
	}
}
