import java.sql.SQLOutput;
import java.util.Scanner;

public class Function {
    public static void PrintHelloWorld() {
        System.out.println("Hello World");

    }


    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = input.nextInt();
        System.out.print("enter second number :");
        int b = input.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("sum is : " + sum);
    }
}