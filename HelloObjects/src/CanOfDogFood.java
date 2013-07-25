import java.util.ArrayList;
import java.util.List;

class CanOfDogFood extends Food {
	private List<Food> ingrediants; // has-a relationship

	CanOfDogFood() {
		super(-1);
		this.ingrediants = new ArrayList<Food>();
	}

	public void addIngredient(Food f) {
		this.ingrediants.add(f);
	}

	public int getCalories() {
		int sum = 0;
		for (Food ingrediant : this.ingrediants) {
			sum += ingrediant.getCalories();
		}
		return sum;
	}
}
