class Dog extends Mammal {

	Dog(String aName) {
		super(aName);
	}

	String bark() {
		return "Wuff Wuff";
	}

	boolean isVegetarian() {
		return false;
	}
}
