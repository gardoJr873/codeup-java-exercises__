import java.util.*;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately" + " %f", pi);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number of your choice:  ");
        Number userInput = scanner.nextInt();
        //if input is not a number exception thread is thrown indicating InputMismatchException

        System.out.print("You entered: " + userInput);
    }
}
