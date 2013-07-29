package my.animalfarm.barn;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import my.animalfarm.DisgustingException;
import my.animalfarm.greenhouse.IFood;

public abstract class Mammal {

	protected String name;
	private List<IFood> foods;
	private int weight = 50;

	Mammal(String aName) {
		super();
		setName(aName);
		foods = new LinkedList<IFood>();
	}

	public void feed(IFood aFood) {
		if (!aFood.isVegetarian()) {
			if (!(this instanceof Omnivore)) {
				throw new DisgustingException("Only Omnivore eat Beef");
			} else {
				foods.add(aFood);
			}
		} else {
			foods.add(aFood);
		}
	}

	Collection<IFood> hasEaten() {
		return foods;
	}

	int weight() {
		return weight;
	}

	abstract boolean isVegetarian();

	@Override
	public String toString() {
		return "Mammal [name=" + getName() + ", foods=" + foods + ", weight="
				+ weight + "]";
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}