class Dog extends Mammal implements Omnivore {

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
