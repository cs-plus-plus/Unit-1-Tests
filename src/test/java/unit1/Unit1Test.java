package unit1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Unit1Test {

    // ── Method 1: addIntegers (20 points) ───────────────────────────────────

    @Test
    @DisplayName("addIntegers: Sum of two integers (20 points)")
    public void testAddIntegers() {
        assertAll("addIntegers",
            () -> assertEquals(5, Unit1.addIntegers(2, 3),
                "addIntegers(2, 3) should return 5 (basic addition)"),
            () -> assertEquals(0, Unit1.addIntegers(0, 0),
                "addIntegers(0, 0) should return 0 (adding zeros)"),
            () -> assertEquals(-5, Unit1.addIntegers(-2, -3),
                "addIntegers(-2, -3) should return -5 (adding negatives)"),
            () -> assertEquals(1, Unit1.addIntegers(-2, 3),
                "addIntegers(-2, 3) should return 1 (mixed positive and negative)")
        );
    }

    // ── Method 2: castDoubleToInt (20 points) ───────────────────────────────

    @Test
    @DisplayName("castDoubleToInt: Cast double to int by truncation (20 points)")
    public void testCastDoubleToInt() {
        assertAll("castDoubleToInt",
            () -> assertEquals(3, Unit1.castDoubleToInt(3.99),
                "castDoubleToInt(3.99) should return 3 (truncates, does NOT round)"),
            () -> assertEquals(0, Unit1.castDoubleToInt(0.49),
                "castDoubleToInt(0.49) should return 0 (truncates decimal portion)"),
            () -> assertEquals(-3, Unit1.castDoubleToInt(-3.99),
                "castDoubleToInt(-3.99) should return -3 (truncation with negatives)"),
            () -> assertEquals(4, Unit1.castDoubleToInt(4.0),
                "castDoubleToInt(4.0) should return 4 (whole number as double)")
        );
    }

    // ── Method 3: isTrue (20 points) ────────────────────────────────────────

    @Test
    @DisplayName("isTrue: Return the boolean value passed in (20 points)")
    public void testIsTrue() {
        assertAll("isTrue",
            () -> assertTrue(Unit1.isTrue(true),
                "isTrue(true) should return true"),
            () -> assertFalse(Unit1.isTrue(false),
                "isTrue(false) should return false")
        );
    }

    // ── Method 4: maxValueMinusOne (20 points) ──────────────────────────────

    @Test
    @DisplayName("maxValueMinusOne: Return Integer.MAX_VALUE - 1 (20 points)")
    public void testMaxValueMinusOne() {
        assertAll("maxValueMinusOne",
            () -> assertEquals(Integer.MAX_VALUE - 1, Unit1.maxValueMinusOne(),
                "maxValueMinusOne() should return Integer.MAX_VALUE - 1 (2147483646). " +
                "Use Integer.MAX_VALUE to get the largest possible int value.")
        );
    }

    // ── Method 5: multiplyIntAndDouble (20 points) ──────────────────────────

    @Test
    @DisplayName("multiplyIntAndDouble: Multiply int and double, return double (20 points)")
    public void testMultiplyIntAndDouble() {
        assertAll("multiplyIntAndDouble",
            () -> assertEquals(6.0, Unit1.multiplyIntAndDouble(2, 3.0), 0.001,
                "multiplyIntAndDouble(2, 3.0) should return 6.0"),
            () -> assertEquals(-6.0, Unit1.multiplyIntAndDouble(-2, 3.0), 0.001,
                "multiplyIntAndDouble(-2, 3.0) should return -6.0 (negative × positive)"),
            () -> assertEquals(0.0, Unit1.multiplyIntAndDouble(0, 3.0), 0.001,
                "multiplyIntAndDouble(0, 3.0) should return 0.0 (anything × 0 = 0)"),
            () -> assertEquals(7.5, Unit1.multiplyIntAndDouble(3, 2.5), 0.001,
                "multiplyIntAndDouble(3, 2.5) should return 7.5 (int × double = double)")
        );
    }
}
