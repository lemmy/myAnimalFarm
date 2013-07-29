package my.animalfarm.greenhouse;

public class Apple extends VegetarianFood {

	public Apple() {
		// delegates to second constructor
		this(5);
	}

	public Apple(int calories) {
		super(calories);
	}
}
