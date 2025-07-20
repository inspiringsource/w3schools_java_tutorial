package CoreConcepts;

public class Main {

    // 2. Main method — program entry point
    public static void main(String[] args) {
        // 3. Variable declaration and initialization with primitive types
        int number = 5;              // int literal
        double decimalNumber = 3.14; // double literal
        boolean isJavaFun = true;    // boolean literal
        char letter = 'J';           // char literal
        String greeting = "Hello, Java!"; // String literal (not primitive)

        // 4. Output to console
        System.out.println(greeting);
        System.out.println("Number: " + number);
        System.out.println("Decimal Number: " + decimalNumber);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Letter: " + letter);

        // 5. Arithmetic and assignment operators
        int result = number * 2; // multiplication
        result += 3;             // compound assignment (result = result + 3)
        System.out.println("Result after operations: " + result);

        // 6. Conditional statement
        if (result > 10) {
            System.out.println("Result is greater than 10.");
        } else {
            System.out.println("Result is 10 or less.");
        }

        // 7. Loop: for loop to print numbers from 1 to 5
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 8. While loop example: countdown from 3
        int countdown = 3;
        System.out.println("Countdown:");
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        // 9. Method call — calculate factorial recursively
        int factorialInput = 5;
        int factorialResult = factorial(factorialInput);
        System.out.println("Factorial of " + factorialInput + " is " + factorialResult);

        // 10. Method call — demonstrate method overloading
        printMessage();           // no parameter
        printMessage("Custom message"); // with parameter
    }

    // Recursive method to calculate factorial of a number
    public static int factorial(int n) {
        if (n <= 1) { // base case
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }

    // Overloaded methods for printing messages
    public static void printMessage() {
        System.out.println("Default message.");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}