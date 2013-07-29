import org.junit.Assert;
import org.junit.Test;

public class SheepTest {

	@Test
	public void testEquality() {
		// Identity
		Assert.assertTrue(new Sheep("Dolly") != new Sheep("Dolly"));

		// Equality
		Assert.assertEquals(new Sheep("Dolly"), new Sheep("Dolly"));
		Assert.assertNotEquals(new Sheep("Dolly"), new Sheep("Shawn"));
		Assert.assertNotEquals(new Sheep("Dolly"), new Dog("Dolly"));
	}

	@Test
	public void testEqualityHashCode() {
		Assert.assertEquals(new Sheep("Dolly").hashCode(),
				new Sheep("Dolly").hashCode());

		Assert.assertNotEquals(new Sheep("Dolly").hashCode(),
				new Sheep("Shawn").hashCode());
		Assert.assertNotEquals(new Sheep("Dolly").hashCode(),
				new Dog("Dolly").hashCode());
	}
}
