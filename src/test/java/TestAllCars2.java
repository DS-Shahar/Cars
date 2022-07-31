
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAllCars2 {

   @Test
   public void testB2()
   {
      AllCars a = new AllCars(3);
      
      Car c;
      boolean b;
      
      c = new Car("8080488", false, 95_000);
      b = a.addCar(c);
      assertEquals(b, true);

      c = new Car("9911485", true, 50_000);
      b = a.addCar(c);
      assertEquals(b, true);
      
      c = new Car("7588321", false, 75_000);
      b = a.addCar(c);
      assertEquals(b, true);
      
      a.print(70_000, 80_000);
   }
}
