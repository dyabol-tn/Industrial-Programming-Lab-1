import static org.junit.jupiter.api.Assertions.*;

class TailorTest {

    @org.junit.jupiter.api.Test
    void testcalculateE_cor_5() {
        double result = Tailor.calculateE(5);
        assertEquals(1e-5, result, 1e-10);
    }

    @org.junit.jupiter.api.Test
    void testcalculateE_un_5() {
        double result = Tailor.calculateE(5);
        assertEquals(1e-7, result, 1e-10);
    }

    @org.junit.jupiter.api.Test
    void testcalculateE_cor_0() {
        double result = Tailor.calculateE(0);
        assertEquals(1, result, 1e-5);
    }

    @org.junit.jupiter.api.Test
    void testcalculateE_un_0() {
        double result = Tailor.calculateE(0);
        assertEquals(0, result, 1e-5);
    }

    @org.junit.jupiter.api.Test
    void testcalculateE_cor_1() {
        double result = Tailor.calculateE(1);
        assertEquals(1e-1, result, 1e-5);
    }

    @org.junit.jupiter.api.Test
    void testcalculateE_un_1() {
        double result = Tailor.calculateE(1);
        assertEquals(1, result, 1e-5);
    }
}