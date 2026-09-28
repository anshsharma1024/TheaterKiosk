import java.util.Scanner;

class TheaterKiosk {
    void main()
    {
        // Declare variables
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        // Ask the user for their age
        System.out.print("What is your age? ");

        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();  // Clear the newline from the key buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid whole number not " + trash);
            System.out.println("Rerun the program and try again!");
            System.exit(0);
        }

        // If the user is 21 or older, they get a wristband, otherwise do nothing
        if(age >= 21)
        {
            System.out.println("You get a wristband!");
        }
    }
}