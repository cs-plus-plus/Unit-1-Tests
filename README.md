# Unit 1: Primitive Types

AP Computer Science A

## Overview

This project covers **Unit 1: Primitive Types** concepts including data types, variable declaration, arithmetic operators, and type casting. Implement the 5 methods in `Unit1.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/unit1/Unit1.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit1Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit1Test#testAddIntegers test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `addIntegers(int a, int b)` | 20 | `int` addition, return values |
| 2 | `castDoubleToInt(double value)` | 20 | Type casting, truncation vs rounding |
| 3 | `isTrue(boolean value)` | 20 | `boolean` type, return values |
| 4 | `maxValueMinusOne()` | 20 | `Integer.MAX_VALUE`, overflow awareness |
| 5 | `multiplyIntAndDouble(int a, double b)` | 20 | Mixed-type arithmetic, type promotion |
| | **Total** | **100** | |

## Method Details

### 1. `addIntegers(int a, int b)` — 20 points
Returns the sum of two integers.
- `addIntegers(2, 3)` → `5`
- `addIntegers(0, 0)` → `0`
- `addIntegers(-2, 3)` → `1`

### 2. `castDoubleToInt(double value)` — 20 points
Converts a double to an int by casting (truncation, not rounding).
- `castDoubleToInt(3.99)` → `3` (NOT 4)
- `castDoubleToInt(0.49)` → `0`
- `castDoubleToInt(-3.99)` → `-3`

### 3. `isTrue(boolean value)` — 20 points
Returns the boolean value passed in.
- `isTrue(true)` → `true`
- `isTrue(false)` → `false`

### 4. `maxValueMinusOne()` — 20 points
Returns `Integer.MAX_VALUE - 1` (2,147,483,646).

### 5. `multiplyIntAndDouble(int a, double b)` — 20 points
Returns the product of an int and a double as a double.
- `multiplyIntAndDouble(2, 3.0)` → `6.0`
- `multiplyIntAndDouble(3, 2.5)` → `7.5`

## Common Mistakes

- Forgetting that casting a `double` to `int` **truncates** (removes decimals) rather than rounds
- Using `==` to compare `double` values (use a threshold instead)
- Not understanding that `int * double` automatically promotes to `double`
- Confusing `Integer.MAX_VALUE` with `Integer.MIN_VALUE`
- Using a variable name without declaring it first

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
