<div align="center">

# Java OOP Activities

**Coursework portfolio for CS 214A: Object-Oriented Programming**

![Java](https://img.shields.io/badge/Java-JDK_8%2B-ED8B00?logo=openjdk&logoColor=white)
![Programs](https://img.shields.io/badge/programs-14-blue)
![Period](https://img.shields.io/badge/coursework-Aug%E2%80%93Sep%202024-lightgrey)
![Status](https://img.shields.io/badge/status-complete-brightgreen)

</div>

---

## Overview

A collection of 14 small Java programs written during CS 214A, built up in the order the course taught them: from a first `Hello World!`, through console input, branching and loops, to arrays, classes and a Swing dialog.

Each program is a self-contained console application. It reads input, does one clearly defined job and prints the result. The one exception is the dialog calculator, which opens a Swing window.

**Skills demonstrated**

- Console I/O with `Scanner`, `BufferedReader` and `JOptionPane`
- Control flow: `if` / `else if` chains and compound conditions
- Loops: `for` loops and nested loops
- Arrays: reading, searching, swapping and sorting
- Classes and objects: defining a class and instantiating it from another
- String handling and concatenation

## Table of Contents

- [Getting Started](#getting-started)
- [Repository Structure](#repository-structure)
- [Programs](#programs)
- [Sample Results](#sample-results)
- [Known Limitations](#known-limitations)

## Getting Started

**Requirements:** a JDK, version 8 or newer. Check with `javac -version`.

Compile and run a program from inside its folder:

```bash
cd activities/02-swap
javac Swap.java
java Swap
```

Programs made of several files compile together:

```bash
cd activities/01-greeter
javac Greeter.java HelloApp2.java
java HelloApp2
```

## Repository Structure

```text
java-oop-activities/
├── lab-activities/            In-class lab exercises
│   ├── 01-hello-world/
│   ├── 02-even-number-check/
│   └── 03-multiplication-table/
├── activities/                Numbered class activities
│   ├── 01-greeter/
│   ├── 02-swap/
│   ├── 03-scanner-calculator/
│   ├── 04-buffered-calculator/
│   ├── 05-grade-remarks/
│   └── 06-natural-number-sum/
├── assignments/               Graded take-home assignments
│   ├── 01-concatenate/
│   ├── 02-dialog-calculator/
│   └── 03-sort-array/
└── array-exercises/           Extra array practice
```

## Programs

Dates are the last-modified dates of the original files (`YYYY-MM-DD`). A dash means the original date was not preserved.

### Lab Activities

| Program | Description | Date |
|---|---|---|
| [HelloWorld](lab-activities/01-hello-world/HelloWorld.java) | First Java program. Prints `Hello World!` | 2024-08-19 |
| [NumberCheck](lab-activities/02-even-number-check/NumberCheck.java) | Accepts a number only if it is even and at least 20, and explains why it rejects anything else | 2024-09-10 |
| [MultiplicationTable](lab-activities/03-multiplication-table/MultiplicationTable.java) | Prints the multiplication table of a number for a chosen number of rows | 2024-09-10 |

### Activities

| # | Program | Description | Concept | Date |
|---|---|---|---|---|
| 1 | [Greeter / HelloApp2](activities/01-greeter) | Creates a `Greeter` object and calls its `sayHello()` method | Classes and objects | 2024-08-27 |
| 2 | [Swap](activities/02-swap/Swap.java) | Swaps two numbers and shows them before and after | Temporary variable | 2024-09-20 |
| 3 | [ScannerCalculator](activities/03-scanner-calculator/ScannerCalculator.java) | Sum, difference, product, quotient and remainder of two numbers | `Scanner` | 2024-09-05 |
| 4 | [BufferedCalculator](activities/04-buffered-calculator/BufferedCalculator.java) | The same calculator, reading input a different way | `BufferedReader` | 2024-09-05 |
| 5 | [GradeRemarks](activities/05-grade-remarks/GradeRemarks.java) | Converts a numeric grade to a remark, from Failed to Excellent | `if` / `else if` | 2024-09-20 |
| 6 | [NatNum](activities/06-natural-number-sum/NatNum.java) | Sums every whole number between a start and an end value | `for` loop | 2024-09-20 |

### Assignments

| # | Program | Description | Concept | Date |
|---|---|---|---|---|
| 1 | [Concatenate](assignments/01-concatenate/Concatenate.java) | Collects adjectives, a game, a friend's name and a verb, then fills them into a short story | String concatenation | 2024-09-22 |
| 2 | [Calculator](assignments/02-dialog-calculator/Calculator.java) | The calculator again, using pop-up dialog boxes (needs a desktop session) | `JOptionPane` | 2024-09-22 |
| 3 | [SortArray](assignments/03-sort-array/SortArray.java) | Reads an array and sorts it ascending (`ASC`) or descending (`DES`) | Arrays, nested loops | 2024-09-20 |

### Array Exercises

| Program | Description | Date |
|---|---|---|
| [UniqueNumbers](array-exercises/UniqueNumbers.java) | Prints the numbers that appear exactly once in an array | 2024-09-24 |
| [SwapAdjacent](array-exercises/SwapAdjacent.java) | Swaps each pair of neighbouring elements (0 and 1, 2 and 3, ...). With an odd size, the last element stays in place | 2024-10-08 |

## Sample Results

Real output from running the programs. Text after a prompt is the user's input.

<details>
<summary><b>Calculator</b>: Activities 3 and 4 produce identical output</summary>

```text
Please enter 1st number: 17
Please enter 2nd number: 5

The Sum is: 22.0
The difference is: 12.0
The product is: 85.0
The quotient is: 3.4
The remainder is: 2.0
```

</details>

<details>
<summary><b>Grade remarks</b>: Activity 5</summary>

| Grade | Remark |
|---|---|
| 60 to 74 | Failed |
| 75 to 79 | Poor |
| 80 to 85 | Good |
| 86 to 89 | Very Good |
| 90 to 100 | Excellent |
| anything else | Grade not in range |

```text
Input your grade: 92
Your Grade is Excellent
```

</details>

<details>
<summary><b>Sum of natural numbers</b>: Activity 6</summary>

```text
Input NumStart: 1
Input NumEnd: 10
The Sum is 55
```

</details>

<details>
<summary><b>Even-number check</b>: Lab 2</summary>

```text
Input a number:  24
Number Accepted.

Input a number:  8
Number Rejected. It is an Even number but less than 20.

Input a number:  7
Number Rejected. It is an Odd Number
```

</details>

<details>
<summary><b>Multiplication table</b>: Lab 3</summary>

```text
Input the Main Number: 
7
How many Loops: 
5
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
```

</details>

<details>
<summary><b>Story builder</b>: Assignment 1</summary>

```text
Enter an adjective: Sunny
Enter the name of an outdoor game: Volleyball
Enter another adjective: Huge
Enter the name of a friend: Maria
Enter a verb ending in ing: swimming
Enter one more adjective: silly

It was a sunny summer day at the beach. My friends and I were in the water playing volleyball.
As a huge wave came closer, my friend Maria yelled, "Look! There's a jellyfish swimming!" ...
```

</details>

<details>
<summary><b>Array sorting</b>: Assignment 3</summary>

```text
Input Array Size: 5
Input an Element: 4
Input an Element: 9
Input an Element: 1
Input an Element: 7
Input an Element: 3

Order (type DES for Descending or ASC for Ascending): ASC

Sorted array: 1 3 4 7 9
```

</details>

<details>
<summary><b>Unique numbers</b>: Array exercise</summary>

```text
Input Array Size: 5
Input an Element: 1
Input an Element: 2
Input an Element: 3
Input an Element: 3
Input an Element: 5

Unique Number(s): 1, 2, 5,
```

</details>

<details>
<summary><b>Swap neighbours</b>: Array exercise</summary>

```text
Enter array size: 5
Enter an element: 1
Enter an element: 2
Enter an element: 3
Enter an element: 4
Enter an element: 5
2 1 4 3 5
```

</details>

## Known Limitations

These are course exercises, so input handling is deliberately minimal:

- Input is not validated. Entering a non-number throws an exception.
- The calculators do not guard against division by zero. Dividing or taking the remainder by zero gives `Infinity` or `NaN` instead of an error.
- `SortArray` expects `ASC` or `DES` in capitals. Anything else prints `Invalid order`.
