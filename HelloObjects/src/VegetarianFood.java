abstract class VegetarianFood extends Food {

	public VegetarianFood(int aCalories) {
		super(aCalories);
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}
}
