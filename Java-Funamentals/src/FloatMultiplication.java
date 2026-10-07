import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Welcome to float calculator !");
        System.out.println("\nEnter your first number = ");
        double first= input.nextDouble();
        System.out.print("Enter your second number =");
        double second= input.nextDouble();

        System.out.println("\n result is : "+ (first * second));
    }
}
