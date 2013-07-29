abstract class Food implements IFood {

	private int calories;

	Food(int aCalories) {
		this.setCalories(aCalories);
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
		return "Food [calories=" + getCalories() + "]";
	}

	void setCalories(int calories) {
		this.calories = calories;
	}
}
