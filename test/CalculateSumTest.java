import static org.junit.jupiter.api.Assertions.*;

class CalculateSumTest {

    @org.junit.jupiter.api.Test
    void testcalculateSum() {
        double result = CalculateSum.calculateSum(0.3, 1e-5);
        assertEquals(0.8770608609481811, result, 1e-10);
    }

    @org.junit.jupiter.api.Test
    void testcalculateSum1() {
        double result = CalculateSum.calculateSum(0.3, 1e-5);
        assertEquals(0.9, result, 1e-10);
    }

    @org.junit.jupiter.api.Test
    void testcalculateSum2() {
        double result = CalculateSum.calculateSum(0, 1e-5);
        assertEquals(0, result, 1e-10);
    }

    @org.junit.jupiter.api.Test
    void testcalculateSum3() {
        double result = CalculateSum.calculateSum(0, 1e-5);
        assertEquals(1, result, 1e-10);
    }
}