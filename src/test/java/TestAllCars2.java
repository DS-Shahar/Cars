

public class TestAllCars2 {

   public static void main(String[] args)
   {
      AllCars a = new AllCars(4);
      
      Car c;
      boolean b;
      
      c = new Car("8080488", false, 95_000);
      b = a.addCar(c);
      assert(b);

      c = new Car("9911485", true, 60_000);
      b = a.addCar(c);
      assert(b);

      c = new Car("8458544", false, 60_000);
      b = a.addCar(c);
      assert(b);
      
      c = new Car("7588321", false, 70_000);
      b = a.addCar(c);
      assert(b);
      
      a.print(50_000, 90_000);
   }
}
