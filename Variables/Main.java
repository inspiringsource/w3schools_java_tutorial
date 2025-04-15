public class Main {
    public static void main(String[] args) {
        // Declare a variable
        System.out.println("# Print variables:");
        String firstName = "John";
        // Print the variable
        System.out.println("Hello: " + firstName);

        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println("Full name: " + fullName);
        System.out.println("# Numeric values and mathematical operator:");
        int myNum = 15;
        // Print the variable
        System.out.println("The value of my Number is: " + myNum);
        
        // Change the value of the variable
        myNum = 20;
        // Print the new value of the variable
        System.out.println("The new value of my Number is now changed to: " + myNum);
        // Declare a new variable
        int myNum2 = 5;
        System.out.println("Adding numbers " + (myNum + myNum2));
        System.out.print("Add multiple variables x + y + z = ");
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
        // Use descriptive variable names
        System.out.println("# Use descriptive variable names:");
        int minutesPerHour = 60;
        System.out.println("Minutes in an hour: " + minutesPerHour);

        System.out.println("# Calculate the Area of a Rectangle:");
        
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

    }
}