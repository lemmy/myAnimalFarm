class Sheep extends Mammal {

	Sheep(String aName) {
		super(aName);
	}

	void feed(Food aFood) {
		if (aFood instanceof Beef) {
			// TODO throw up
			System.out.println("Sheep do not eat meat");
		} else {
			calories += aFood.getCalories();
		}
	}
}
