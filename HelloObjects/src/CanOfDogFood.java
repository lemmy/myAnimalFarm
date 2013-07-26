import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	Set<Class<IFood>> ingredientInformation() {
		Set<Class<IFood>> set = new HashSet<Class<IFood>>();
		for (Food f : ingrediants) {
			Class<IFood> class1 = (Class<IFood>) f.getClass();
			set.add(class1);
		}
		return set;
	}
}
