import java.util.Collection;

class Prey extends Food {

	Prey(Mammal aMammal) {
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
