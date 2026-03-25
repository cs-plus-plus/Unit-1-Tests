# CS++ Java — Unit 1: Primitive Types

> **Unit 1** | 100 Points | 5 Autograded Tests

In this assignment you will practice declaring variables, performing arithmetic, type casting between `int` and `double`, and working with boolean values. All methods are `static` — you call them with `Unit1.methodName()`.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### Primitive Data Types

Java has eight primitive types. The four you will use most:

| Type | What It Stores | Example |
|------|---------------|---------|
| `int` | Whole numbers | `int age = 17;` |
| `double` | Decimal numbers | `double gpa = 3.85;` |
| `boolean` | `true` or `false` | `boolean passed = true;` |
| `char` | Single character | `char grade = 'A';` |

### Arithmetic Operators

```java
int a = 10, b = 3;

a + b    // 13    (addition)
a - b    // 7     (subtraction)
a * b    // 30    (multiplication)
a / b    // 3     (integer division — truncates the decimal)
a % b    // 1     (modulo — remainder)
```

**Important:** When both operands are `int`, division truncates. `10 / 3` is `3`, not `3.33`.

### Type Casting

Convert between types using a cast:

```java
// double to int — truncates (does NOT round)
double x = 9.99;
int y = (int) x;    // y is 9

// int to double
int a = 5;
double b = (double) a;   // b is 5.0

// Mixed arithmetic
int c = 7;
double d = 2.0;
double result = c * d;   // result is 14.0 (int is promoted to double)
```

### Integer.MAX_VALUE

Java's `int` type can hold values up to `2,147,483,647`. This maximum is stored in the constant:

```java
int max = Integer.MAX_VALUE;   // 2147483647
```

### Boolean Values

A `boolean` variable holds exactly `true` or `false`:

```java
boolean isRaining = true;
boolean isSunny = false;

// You can return a boolean from a method
public static boolean isPositive(int n) {
    return n > 0;
}
```

---

## Project Overview

You will implement five methods in `Unit1.java`. Each method demonstrates a fundamental concept of primitive types in Java.

---

## Methods to Implement

### 1. addIntegers(int a, int b)
Return the sum of two integers.

```java
addIntegers(2, 3)    // returns 5
addIntegers(-1, 1)   // returns 0
addIntegers(0, 0)    // returns 0
```

### 2. castDoubleToInt(double value)
Cast the double to an int and return it. Remember: casting truncates, it does not round.

```java
castDoubleToInt(9.99)   // returns 9
castDoubleToInt(3.14)   // returns 3
castDoubleToInt(-2.7)   // returns -2
```

### 3. isTrue(boolean value)
Return the boolean value that is passed in.

```java
isTrue(true)    // returns true
isTrue(false)   // returns false
```

### 4. maxValueMinusOne()
Return `Integer.MAX_VALUE - 1`. This method takes no parameters.

```java
maxValueMinusOne()   // returns 2147483646
```

### 5. multiplyIntAndDouble(int a, double b)
Multiply the int and double together and return the result as a double.

```java
multiplyIntAndDouble(3, 2.5)    // returns 7.5
multiplyIntAndDouble(4, 0.5)    // returns 2.0
multiplyIntAndDouble(0, 9.99)   // returns 0.0
```

---

## File Structure

```
Unit-1-Tests/
├── pom.xml                                <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/unit1/
│   │   └── Unit1.java                     <-- YOUR CODE GOES HERE
│   └── test/java/unit1/
│       └── Unit1Test.java                 <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                  <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit1.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testAddIntegers | `addIntegers(2, 3)` returns `5` | 20 |
| testCastDoubleToInt | `castDoubleToInt(9.99)` returns `9` | 20 |
| testIsTrue | `isTrue(true)` returns `true` | 20 |
| testMaxValueMinusOne | `maxValueMinusOne()` returns `2147483646` | 20 |
| testMultiplyIntAndDouble | `multiplyIntAndDouble(3, 2.5)` returns `7.5` | 20 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Integer arithmetic:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;
        System.out.println("Sum: " + (a + b));         // 22
        System.out.println("Difference: " + (a - b));   // 12
        System.out.println("Product: " + (a * b));       // 85
        System.out.println("Quotient: " + (a / b));      // 3 (not 3.4!)
        System.out.println("Remainder: " + (a % b));     // 2
    }
}
```

**Example 2 — Type casting:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        double price = 29.99;
        int dollars = (int) price;
        System.out.println("Price: " + price);     // 29.99
        System.out.println("Dollars: " + dollars);  // 29 (truncated)

        int x = 7;
        int y = 2;
        System.out.println("Int division: " + (x / y));          // 3
        System.out.println("Double division: " + ((double) x / y)); // 3.5
    }
}
```

**Example 3 — Mixed types:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int count = 4;
        double multiplier = 2.5;
        double result = count * multiplier;
        System.out.println("Result: " + result);  // 10.0

        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);         // 2147483647
        System.out.println("MAX_VALUE - 1: " + (Integer.MAX_VALUE - 1)); // 2147483646
    }
}
```

---

## Tips for Success

1. All methods in this assignment are `static` — do not create an object to call them
2. Casting a double to int always truncates (drops the decimal), it never rounds
3. When both operands are `int`, the result is `int`. To get a double result, cast one operand
4. `Integer.MAX_VALUE` is a built-in constant — you do not need to memorize the number
5. Make sure your method signatures match exactly: same name, same parameter types, same return type
6. Run `mvn test` after each method to verify before moving on

---

## FAQ

**Q: What is the difference between `int` and `double`?**
`int` stores whole numbers only (no decimals). `double` stores decimal numbers. When you divide two ints, the result is truncated to an int.

**Q: Why does `(int) 9.99` give `9` and not `10`?**
Casting to int truncates — it drops everything after the decimal point. It does not round. Use `Math.round()` if you need rounding (but this assignment wants truncation).

**Q: What happens if I add 1 to `Integer.MAX_VALUE`?**
It overflows and wraps around to `Integer.MIN_VALUE` (-2147483648). This is why the assignment asks for `MAX_VALUE - 1` instead.

**Q: Do I need to handle negative numbers?**
Only where the tests send them. For `addIntegers` and `castDoubleToInt`, the tests may use negative values, so make sure your logic works for those cases.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
