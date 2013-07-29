abstract class Food implements IFood {

	int calories;

	Food(int aCalories) {
		this.calories = aCalories;
	}

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public boolean isVegetarian() {
		// By default all food is non-vegetarian
		return false;
	}

	@Override
	public String toString() {
		return "Food [calories=" + calories + "]";
	}
}
