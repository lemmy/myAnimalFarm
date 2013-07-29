package my.animalfarm.barn;

public abstract class Vegetarian extends Mammal {

	Vegetarian(String aName) {
		super(aName);
	}

	boolean isVegetarian() {
		return true;
	}
}
