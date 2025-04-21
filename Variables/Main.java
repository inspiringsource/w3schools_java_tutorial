import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // Print empty line
        // Declare a variable
        System.out.println("# Print variables:");
        String firstName = "John";
        // Print the variable
        System.out.println("Hello: " + firstName);

        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        char firstInitial = firstName.charAt(0);
        System.out.println("Full name: " + fullName);
        System.out.println("First name letter: " + firstInitial);

        System.out.println(); // Print empty line
        System.out.println("# Numeric values and mathematical operator:");
        int myNum = 15;
        // Print the variable
        System.out.println("The value of my Number is: " + myNum);

        // Change the value of the variable
        myNum = 20;
        // Print the new value of the variable
        System.out.println("The new value of my Number is now changed to: " + myNum);
        // Declare a new float variable
        float myNum2 = 5.5f;
        System.out.println("20 + 5.5 = " + (myNum + myNum2));
        System.out.print("Add multiple variables x + y + z = ");
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        System.out.println();
        // Use descriptive variable names
        System.out.println("# Use descriptive variable names:");
        int minutesPerHour = 60;
        System.out.println("Minutes in an hour: " + minutesPerHour);
        System.out.println();
        System.out.println("# Calculate the Area of a Rectangle:");

        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;
        System.out.println(
                String.format("Calculating the area of a rectangle with length %d and width %d", length, width));
        // Print Area
        System.out.println("Area of the rectangle is: " + area);
        // Boolean variables
        boolean isJavaFun = true;
        System.out.println("Is Java fun? " + isJavaFun);
        // Java Type Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println();
        System.out.println("# Widening Casting:");

        System.out.println(myInt + "is an int"); // Outputs 9
        System.out.println(myDouble + "is an double"); // Outputs 9.0
        int myNewInt = (int) myDouble; // Manual casting: double to int
        System.out.println();
        System.out.println("# Narrowing Casting:");
        System.out.println(myDouble + " is a double");
        System.out.println(myNewInt + " is an int");
        // Java Operators
        System.out.println();
        System.out.println("# Java Operators:");
        int x2 = 2 + 3;
        System.out.println(x2 + " is the sum of 2 and 3");
        ++x2;
        System.out.println(x2 + "++ Arithmetic Operators incremented x2 by 1");
        if (x2 > 5) {
            System.out.println(x2 + " x2 is now greater than 5");
        } else {
            System.out.println(x2 + " x2 is less than or equal to 5");
        }
        double pi = Math.PI; // Java's built-in value of pi
        double rad = 360 / (2 * pi); // radian in degrees
        // Print pi to 6 decimal places
        System.out.printf("pi = %.6f%n", pi);

        // Print the radian value
        System.out.printf("1 rad = 360 degrees / (2 * pi) = %.2f degrees%n", rad);
        // Java Strings
        System.out.println("\n# Java Operators:");

        String javaIsFunString = ("Is Java fun? \t" + isJavaFun + ". \n(All upper case)");
        System.out.println(javaIsFunString.toUpperCase());
        // Java Math
        System.out.println();
        System.out.println("# Java Math:");
        System.out.println("The square root of 9 is: " + (int) (Math.sqrt(9)));
        // Java Boolean
        System.out.println();
        System.out.println("# Java Boolean:");
        System.out.println(x > y);
        System.out.println(x < y);

        // Java if...else
        System.out.println();
        System.out.println("# Java if...else:");
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // yes no Loop
        while (true) {
            System.out.print("yes or no? ");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("yes")) {
                System.out.println("You typed yes. Good choice.");
                break;
            } else if (input.equals("no")) {
                System.out.println("You typed no. That works as well.");
                break;
            } else {
                System.out.println("Please type 'yes' or 'no'.");
            }
        }

        scanner.close();
        // Java switch
        System.out.println();
        System.out.println("# Java switch:");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mitwoch");
                break;
            case 4:
                System.out.println("Donnertag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Invalid day");
        }
        // Java while loop
        System.out.println();
        System.out.println("# Java while loop:");
        int i = 0;
        while (i < 5) {
            System.out.println("i is: " + i);
            i++;
        }
        // Java for loop and Nested for loop
        System.out.println();
        System.out.println("# Java Nested for loop:");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("j is (outerloop): " + j + ", k (innerloop) is: " + k);
            }
        }
        // Java Break and Continue
        System.out.println();
        System.out.println("# Java Break and Continue:");
        System.out.println("We break the loop when b = 2");
        int b = 0;
        while (b < 10) {
            System.out.println(b);
            b++;

            if (b == 2) {
                break;
            }
        }
        // Java Arrays
        System.out.println();
        System.out.println("# Java Arrays:");
        String[] myStatus = { "Awesome", "Cool", "Amazing", "Wonderful" };
        // Randomly select an array element
        int randomIndex = (int) (Math.random() * myStatus.length);
        System.out.println("Randomly selected status: " + myStatus[randomIndex]);
        // Print all array elements
        System.out.println("All status:");
        for (String status : myStatus) {
            System.out.println(status);
        }
        // Java ArrayList
        System.out.println();
        System.out.println("# Java ArrayList:");
        java.util.ArrayList<String> myArrayList = new java.util.ArrayList<String>();
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");
        myArrayList.add("Date");
        // Print all elements in the ArrayList
        System.out.println("All elements in the ArrayList:");
        for (String fruit : myArrayList) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("The End");

    }
}