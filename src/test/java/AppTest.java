import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest{

    @Test
    void testMedicine(){
        assertTrue(App.isValidMedicine("Raviraghul"));
        assertFalse(App.isValidMedicine(""));
    }

    @Test
    void testDosage(){
        assertTrue(App.isValidDosage(240));
        assertFalse(App.isValidDosage(10000));
    }
}