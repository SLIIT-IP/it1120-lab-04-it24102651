import java.util.Scanner;

public class IT24102651Lab4Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        // Use the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive."
                    : (number < 0) ? "The number is Negative."
                    : "The number is Zero.";

       
        System.out.println(result);

        
    }
}