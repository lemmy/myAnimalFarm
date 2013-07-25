class Sheep extends Vegetarian {

	Sheep(String aName) {
		super(aName);
	}

	void feed(Food aFood) {
		if (aFood instanceof Beef) {
			throw new DisgustingException("Do not feed Beef to Sheep!");
		} else {
			super.feed(aFood);
		}
	}
}
