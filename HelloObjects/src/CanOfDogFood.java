import java.util.ArrayList;
import java.util.List;

class CanOfDogFood implements IFood {
	private List<Food> ingrediants; // has-a relationship

	CanOfDogFood() {
		this.ingrediants = new ArrayList<Food>();
	}

	public void addIngredient(Food f) {
		this.ingrediants.add(f);
	}

	public int getCalories() {
		int sum = 0;
		for (IFood ingrediant : this.ingrediants) {
			sum += ingrediant.getCalories();
		}
		return sum;
	}

	@Override
	public boolean isVegetarian() {
		boolean result = true;
		for (IFood ingrediant : this.ingrediants) {
			result &= ingrediant.isVegetarian();
		}
		return result;
	}
}
