import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.Main;
public class Tests {

    @Test
    public void testCalculateDistance() {

        double distance = Main.calculateDistance(1.0, 2.0, 4.0, 6.0);
        assertEquals(5.0, distance, 0.001); // Tolerate small differences due to double precision
    }

}
