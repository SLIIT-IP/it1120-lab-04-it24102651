import java.util.Scanner;
public class IT24102651Lab4Q1 {
	public static void main(String[] args){
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number =");
		int num = src.nextInt();
		if(num>0){
			System.out.println("The number is: Positive");
		}
		else if(num<0)
		{
			System.out.println("The number is: Negative");
		}
		else{
			System.out.println("The number is: Zero");
		}
	}
}