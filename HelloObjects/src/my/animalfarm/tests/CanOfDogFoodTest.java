package my.animalfarm.tests;
import my.animalfarm.greenhouse.Apple;
import my.animalfarm.greenhouse.Beef;
import my.animalfarm.greenhouse.CanOfDogFood;

import org.junit.Assert;
import org.junit.Test;

public class CanOfDogFoodTest {

	@Test
	public void testIsVegetarian() {
		CanOfDogFood aFood = new CanOfDogFood();
		aFood.addIngredient(new Apple());
		aFood.addIngredient(new Beef());
		Assert.assertTrue("Composite with meat is not vegetarian",
				!aFood.isVegetarian());
	}
}
