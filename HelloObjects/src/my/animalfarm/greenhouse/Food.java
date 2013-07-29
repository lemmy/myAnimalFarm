package my.animalfarm.greenhouse;

public abstract class Food implements IFood {

	private int calories;

	protected Food(int aCalories) {
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

	public void setCalories(int calories) {
		this.calories = calories;
	}
}
