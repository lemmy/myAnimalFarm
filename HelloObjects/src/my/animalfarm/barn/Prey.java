package my.animalfarm.barn;

import java.util.Collection;

import my.animalfarm.greenhouse.Food;
import my.animalfarm.greenhouse.IFood;

public class Prey extends Food {

	public Prey(Mammal aMammal) {
		super(sumFoodFunction(aMammal.hasEaten()));
	}

	static int sumFoodFunction(Collection<IFood> hasEaten) {
		int sum = 0;
		for (IFood iFood : hasEaten) {
			sum = sum + iFood.getCalories();
		}
		return sum;
	}
}
