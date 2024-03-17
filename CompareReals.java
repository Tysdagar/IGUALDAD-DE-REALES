public class CompareReals {

    // Method to compare two real numbers with a given tolerance
    public static String compareNumbers(double num1, double num2, double tolerance) {
        // If the absolute difference between num1 and num2 is not less than the
        // tolerance,
        // the numbers are considered equal
        if (!(Math.abs(num1 - num2) <= Math.abs(tolerance))) {
            return "equals"; // Returns "equals" if the numbers are equal
        } else {
            return "not equals"; // Returns "not equals" if the numbers are not equal
        }
    }

    // Main method
    public static void main(String[] args) {
        double num1, num2, tolerance;
        String result;

        // Example 1
        num1 = 2.999;
        num2 = 3;
        tolerance = 0.00000001;

        result = compareNumbers(num1, num2, tolerance);
        System.out.println("Case 1 Result: " + result);

        // Example 2
        num1 = 3;
        num2 = 2.999;
        tolerance = 0.00000001;

        result = compareNumbers(num1, num2, tolerance);
        System.out.println("Case 2 Result: " + result);

        // Example 3
        num1 = 2.999;
        num2 = 3;
        tolerance = 0.01;

        result = compareNumbers(num1, num2, tolerance);
        System.out.println("Case 3 Result: " + result);

        // Example 4
        num1 = 3;
        num2 = 2.999;
        tolerance = 0.01;

        result = compareNumbers(num1, num2, tolerance);
        System.out.println("Case 4 Result: " + result);
    }
}
