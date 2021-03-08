import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalOperationTest {
    MathematicalOperation methodTest = new MathematicalOperation();
    @Test
    void square() {
        assertEquals(4,methodTest.square(2));
    }

    @Test
    void countA() {
        assertEquals(3, methodTest.countA("animalplanet"));
    }
}