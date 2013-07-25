import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

abstract class Mammal {

	String name;
	int calories;
	List<IFood> foods;
	int weight = 50;

	Mammal(String aName) {
		super();
		name = aName;
		foods = new ArrayList<IFood>();
	}

	void feed(IFood aFood) {
		if (aFood instanceof Beef) {
			if (!(this instanceof Omnivore)) {
				throw new DisgustingException("Only Omnivore eat Beef");
			} else {
				foods.add(aFood);
				calories = calories + aFood.getCalories();
			}
		} else {
			foods.add(aFood);
			calories = calories + aFood.getCalories();
		}
	}

	Collection<IFood> hasEaten() {
		return foods;
	}

	int weight() {
		return weight;
	}

	abstract boolean isVegetarian();
}