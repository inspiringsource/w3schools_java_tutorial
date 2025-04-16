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
        System.out.println(String.format("Calculating the area of a rectangle with length %d and width %d", length, width));
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
        
        System.out.println(myInt + "is an int");      // Outputs 9
        System.out.println(myDouble + "is an double");   // Outputs 9.0
        int myNewInt = (int) myDouble; // Manual casting: double to int
        System.out.println();
        System.out.println("# Narrowing Casting:");
        System.out.println(myDouble + " is a double"); 
        System.out.println(myNewInt + " is an int");

    }
}