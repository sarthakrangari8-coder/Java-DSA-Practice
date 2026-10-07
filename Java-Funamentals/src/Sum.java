import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your first number : ");
        int num1= input.nextInt();
        System.out.print("now,please enter your second number : ");
        int num2= input.nextInt();

        int sum= num1+num2;
        System.out.println("the sum of to number is "+ sum);

    }

}
