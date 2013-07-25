class Dog extends Mammal implements Omnivore, Predator {

	Dog(String aName) {
		super(aName);
	}

	String bark() {
		return "Wuff Wuff";
	}

	boolean isVegetarian() {
		return false;
	}

	public void hunt(Mammal m) {
		if (m instanceof Predator) {
			// Do not hunt other predators
			return;
		} else {
			// adapter
			this.feed(new Prey(m));
		}
	}
}
