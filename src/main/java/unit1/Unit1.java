package unit1;

public class Unit1 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test addIntegers
        System.out.println("addIntegers(3, 5) = " + addIntegers(3, 5));  // Expected: 8
    }

    /**
     * Returns the sum of two integers.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>addIntegers(2, 3) returns 5</li>
     *   <li>addIntegers(0, 0) returns 0</li>
     *   <li>addIntegers(-2, 3) returns 1</li>
     * </ul>
     *
     * <p>Hint: Use the + operator to add two integers together.</p>
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int addIntegers(int a, int b) {
        // Your code here
        return 0; // Placeholder return
    }

    /**
     * Converts a double to an int by casting (truncation, not rounding).
     * Casting a double to an int removes the decimal portion entirely.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>castDoubleToInt(3.99) returns 3 (NOT 4 — casting truncates)</li>
     *   <li>castDoubleToInt(0.49) returns 0</li>
     *   <li>castDoubleToInt(-3.99) returns -3</li>
     *   <li>castDoubleToInt(4.0) returns 4</li>
     * </ul>
     *
     * <p>Hint: Use (int) to cast the double value. For example: (int) 3.14 → 3</p>
     *
     * @param value the double value to cast
     * @return the value cast to an int (truncated)
     */
    public static int castDoubleToInt(double value) {
        // Your code here
        return 0; // Placeholder return
    }

    /**
     * Returns the boolean value passed in. If true is passed, return true.
     * If false is passed, return false.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isTrue(true) returns true</li>
     *   <li>isTrue(false) returns false</li>
     * </ul>
     *
     * <p>Hint: Simply return the parameter. A boolean variable already holds
     * a true or false value — you don't need an if statement!</p>
     *
     * @param value the boolean value to check
     * @return true if value is true, false otherwise
     */
    public static boolean isTrue(boolean value) {
        // Your code here
        return false; // Placeholder return
    }

    /**
     * Returns the maximum integer value minus one.
     * Java's int type has a maximum value of 2,147,483,647 (about 2.1 billion).
     *
     * <p>Points: 20</p>
     *
     * <p>Example:</p>
     * <ul>
     *   <li>maxValueMinusOne() returns 2147483646</li>
     * </ul>
     *
     * <p>Hint: Use the Integer.MAX_VALUE constant and subtract 1.
     * Integer.MAX_VALUE gives you the largest value an int can hold.</p>
     *
     * @return Integer.MAX_VALUE minus one
     */
    public static int maxValueMinusOne() {
        // Your code here
        return 0; // Placeholder return
    }

    /**
     * Returns the product of an integer and a double as a double.
     * When you multiply an int by a double, Java automatically
     * promotes the int to a double before multiplying.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>multiplyIntAndDouble(2, 3.0) returns 6.0</li>
     *   <li>multiplyIntAndDouble(3, 2.5) returns 7.5</li>
     *   <li>multiplyIntAndDouble(0, 3.0) returns 0.0</li>
     * </ul>
     *
     * <p>Hint: Simply multiply a * b. The result will automatically be
     * a double because one of the operands is a double.</p>
     *
     * @param a the integer value
     * @param b the double value
     * @return the product of a and b as a double
     */
    public static double multiplyIntAndDouble(int a, double b) {
        // Your code here
        return 0.0; // Placeholder return
    }
}
