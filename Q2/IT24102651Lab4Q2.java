import java.util.Scanner;

public class IT24102651Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Please enter exam marks (0 - 100): ");
        double examMarks = sc.nextDouble();

        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks! Marks should be between 0 and 100.");
            
        }

      
        System.out.print("Please enter lab submission marks (0 - 100): ");
        double labMarks = sc.nextDouble();

       
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab submission marks! Marks should be between 0 and 100.");
            
        }

        
        System.out.print("Please enter the percentage taken given for the exam : ");
        double examPercentage = sc.nextDouble();


        System.out.print("Please enter percentage given for the lab submission marks: ");
        double labPercentage = sc.nextDouble();

      
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! The sum of percentages should be equal to 100.");
            
        }

       
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

      
        System.out.println("The final mark is: " + finalMark);
    }
}