class Apple extends VegetarianFood {

	Apple() {
		// delegates to second constructor
		this(5);
	}

	Apple(int calories) {
		super(calories);
	}
}
