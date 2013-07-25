abstract class Food implements IFood {

	int calories;

	Food(int aCalories) {
		this.calories = aCalories;
	}

	@Override
	public int getCalories() {
		return calories;
	}
}
