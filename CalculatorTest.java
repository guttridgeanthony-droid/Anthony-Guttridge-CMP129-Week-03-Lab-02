/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 2
 * Assignment: Calculator Method Overloading
 * Date:
 */

 class CalculatorTest {

    public static void main(String[] args) {
        // Instantiate the Calculator object
        Calculator calc = new Calculator();
        int sumTwoInts = calc.add(10, 5);
        System.out.println("Sum of two integers: " + sumTwoInts);
        double sumTwoDoubles = calc.add(6.5, 6.75);
        System.out.println("Sum of two doubles: " + sumTwoDoubles);
        int sumThreeInts = calc.add(10, 10, 10);
        System.out.println("Sum of three integers: " + sumThreeInts);
        String concatenatedString = calc.add("Hello ", "World");
        System.out.println("Concatenated strings: " + concatenatedString);
    }
}