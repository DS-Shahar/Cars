
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCar {

   @Test
   public void testA()
   {
      Car c = new Car("8080488", false, 95_000);

      boolean b = c.range(80_000, 100_000);     
      assertEquals(b, true);

      b = c.range(100_000, 200_000);     
      assertEquals(b, false);
   }
}
