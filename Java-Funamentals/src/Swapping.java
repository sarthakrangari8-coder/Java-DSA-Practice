import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to swaping number system ");
        System.out.println("enter value of A :");
        int A= input.nextInt();
        System.out.println("enter value od B :");
        int B= input.nextInt();

        int C=A;
        A=B;
        B=C;
        System.out.println("value of A is = " +A);
        System.out.println("value of B is = "+B);

    }
}
