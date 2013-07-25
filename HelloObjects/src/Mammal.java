abstract class Mammal {

	String name;
	int calories;
	IFood food;

	Mammal(String aName) {
		super();
		name = aName;
	}

	void feed(IFood aFood) {
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

	IFood hasEaten() {
		return food;
	}

	abstract boolean isVegetarian();
}