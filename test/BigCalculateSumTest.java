import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BigCalculateSumTest {

    @org.junit.jupiter.api.Test
    void testcalculateBigSum() {
        BigDecimal x = new BigDecimal("0.3");
        BigDecimal e = new BigDecimal("1e-5");
        BigDecimal expected = new BigDecimal("0.8770572103307342529296875000000000");
        BigDecimal result = BigCalculateSum.calculateBigSum(x, e);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateBigSum2() {
        BigDecimal x = new BigDecimal("0.3");
        BigDecimal e = new BigDecimal("1e-5");
        BigDecimal expected = new BigDecimal("0.99");
        BigDecimal result = BigCalculateSum.calculateBigSum(x, e);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateBigSum3() {
        BigDecimal x = new BigDecimal("0.7");
        BigDecimal e = new BigDecimal("1e-7");
        BigDecimal expected = new BigDecimal("0.7669649553725178476592080710035872");
        BigDecimal result = BigCalculateSum.calculateBigSum(x, e);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateBigSum4() {
        BigDecimal x = new BigDecimal("0.7");
        BigDecimal e = new BigDecimal("1e-7");
        BigDecimal expected = new BigDecimal("0.45");
        BigDecimal result = BigCalculateSum.calculateBigSum(x, e);
        assertEquals(0, result.compareTo(expected));
    }
}