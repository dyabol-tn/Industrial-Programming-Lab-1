import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigTailorTest {

    @org.junit.jupiter.api.Test
    void testcalculateE() {
        BigInteger x = new BigInteger("5");
        BigDecimal expected = new BigDecimal("1e-5");
        BigDecimal result = BigCalculateSum.calculateE(x);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateE1() {
        BigInteger x = new BigInteger("5");
        BigDecimal expected = new BigDecimal("1e-3");
        BigDecimal result = BigCalculateSum.calculateE(x);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateE2() {
        BigInteger x = new BigInteger("3");
        BigDecimal expected = new BigDecimal("1e-3");
        BigDecimal result = BigCalculateSum.calculateE(x);
        assertEquals(0, result.compareTo(expected));
    }

    @org.junit.jupiter.api.Test
    void testcalculateE3() {
        BigInteger x = new BigInteger("3");
        BigDecimal expected = new BigDecimal("1e-5");
        BigDecimal result = BigCalculateSum.calculateE(x);
        assertEquals(0, result.compareTo(expected));
    }
}