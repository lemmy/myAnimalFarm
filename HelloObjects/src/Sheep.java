class Sheep extends Vegetarian {

	Sheep(String aName) {
		super(aName);
	}

	void feed(IFood aFood) {
		if (aFood instanceof Beef) {
			throw new DisgustingException("Do not feed Beef to Sheep!");
		} else {
			super.feed(aFood);
		}
	}
}
