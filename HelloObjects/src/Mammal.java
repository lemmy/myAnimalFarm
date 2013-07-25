abstract class Mammal {

	String name;
	int calories;
	Food food;

	Mammal(String aName) {
		super();
		name = aName;
	}

	void feed(Food aFood) {
		if (aFood instanceof Beef) {
			if (!(this instanceof Omnivore)) {
				throw new DisgustingException("Only Omnivore eat Beef");
			} else {
				food = aFood;
				calories = calories + aFood.getCalories();
			}
		} else {
			food = aFood;
			calories = calories + aFood.getCalories();
		}
	}

	int getCalories() {
		return calories;
	}

	Food hasEaten() {
		return food;
	}

	abstract boolean isVegetarian();
}