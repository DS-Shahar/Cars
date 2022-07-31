
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAllCars2 {

   @Test
   public void testB2()
   {
      AllCars a = new AllCars(4);
      
      Car c;
      boolean b;
      
      c = new Car("8080488", false, 95_000);
      b = a.addCar(c);
      assertEquals(b, true);

      c = new Car("9911485", true, 60_000);
      b = a.addCar(c);
      assertEquals(b, true);

      c = new Car("8458544", false, 60_000);
      b = a.addCar(c);
      assertEquals(b, true);
      
      c = new Car("7588321", false, 70_000);
      b = a.addCar(c);
      assertEquals(b, true);
      
      a.print(50_000, 90_000);
   }
}
