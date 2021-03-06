import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalOperationTest {
    MathematicalOperation methodTest = new MathematicalOperation();
    @Test
    void square() {
        assertEquals(9,methodTest.square(3));
    }

    @Test
    void countA() {
        assertEquals(3, methodTest.countA("animalplanet"));
    }
}