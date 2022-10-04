/*
 * Code for testing the "cars question".
 * 
 * Note that for Java, 95_000 is the same as 95000 or 95E+3. 
 * 
 * To make "assert" function work: 
 * Open "Run"|"Run Configurations...", click "Arguments" and in "VM Arguments" write: -enableassertions
 */
public class TestCars {

	public static void testA() {
		Car c = new Car("8080488", false, 95_000);

		boolean b = c.range(80_000, 100_000);
		assert (b == true);

		b = c.range(100_000, 200_000);
		assert (b == false);
	}

	public static void testB1() {
		AllCars a = new AllCars(2);

		Car c;
		boolean b;

		c = new Car("8080488", false, 95_000);
		b = a.addCar(c);
		assert (b == true);

		c = new Car("9911485", true, 50_000);
		b = a.addCar(c);
		assert (b == true);

		c = new Car("7588321", false, 75_000);
		b = a.addCar(c);
		assert (b == false);
	}

	public static void testB2() {
		AllCars a = new AllCars(4);

		Car c;
		boolean b;

		c = new Car("8080488", false, 95_000);
		b = a.addCar(c);
		assert (b == true);

		c = new Car("9911485", true, 60_000);
		b = a.addCar(c);
		assert (b == true);

		c = new Car("8458544", false, 60_000);
		b = a.addCar(c);
		assert (b == true);

		c = new Car("7588321", false, 70_000);
		b = a.addCar(c);
		assert (b == true);

		a.print(50_000, 90_000);
	}

	public static void testB3() {
		AllCars a = new AllCars(4);
		Car c;
		boolean b;

		c = new Car("8080488", false, 95_000);
		b = a.addCar(c);
		assert (b == true);

		Car c2 = new Car(c);
		assert (c2.getLicenseNum().equals(c.getLicenseNum()));
		assert (c2.getHadAccident() == c.getHadAccident());
		assert (c2.getPrice() == c.getPrice());

		a.addCar(c2);

		AllCars a2 = new AllCars(a);
		assert (a2.getNum() == a.getNum());
	}

	public static void main(String[] args) {
		testA();
		testB1();
		testB2();
		testB3();
		System.out.println("Okay");
	}
}
