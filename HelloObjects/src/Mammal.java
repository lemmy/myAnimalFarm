class Mammal {

	String name;
	int calories;
	Food food;

	Mammal(String aName) {
		super();
		name = aName;
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