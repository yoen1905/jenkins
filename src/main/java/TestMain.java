import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {
    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(23)); // Assertion
    }
}
