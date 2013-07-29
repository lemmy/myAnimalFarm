import org.junit.Assert;
import org.junit.Test;

public class MammalTest {

	@Test
	public void testFeedDog() {
		CanOfDogFood aFood = new CanOfDogFood();
		aFood.addIngredient(new Apple());
		aFood.addIngredient(new Potato());
		aFood.addIngredient(new Beef());

		Mammal aMammal = new Dog("TestDog");
		aMammal.feed(aFood);
	}

	@Test
	public void testFeedSheep() {
		CanOfDogFood aFood = new CanOfDogFood();
		aFood.addIngredient(new Apple());
		aFood.addIngredient(new Potato());
		aFood.addIngredient(new Beef());

		Mammal aMammal = new Sheep("TestSheep");
		try {
			aMammal.feed(aFood);
		} catch (DisgustingException e) {
			// Expected
			return;
		}
		Assert.fail("Sheeps expected to throw DisgustingException when fed with meat!");
	}

	@Test
	public void testFeedMammalAsFood() {
		IFood aFood = new Prey(new Sheep("TestFood"));

		Mammal aMammal = new Sheep("TestSheep");
		try {
			aMammal.feed(aFood);
		} catch (DisgustingException e) {
			// Expected
			return;
		}
		Assert.fail("Sheeps expected to throw DisgustingException when fed with meat!");
	}

}
