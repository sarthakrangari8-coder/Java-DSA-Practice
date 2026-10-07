import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing bitwise And operator  ");
        System.out.print("Please enter your first number :");
        int first=input.nextInt();
        System.out.print("now,enter your second number : ");
        int second= input.nextInt();

        int result=first ^ second;
        System.out.println("result is "+result);
    }
}
