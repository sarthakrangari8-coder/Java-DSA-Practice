import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("welcome to Arithmetic calculator ");
        Scanner input =new Scanner(System.in);
        System.out.println("please enter your first number : ");
        int firstNum= input.nextInt();
        System.out.println("please enter your second number : ");
        int secondNum= input.nextInt();

        int sum=firstNum+secondNum;
        int sub=firstNum-secondNum;
        int mul=firstNum*secondNum;
        int div=firstNum/secondNum;
        System.out.println("the sum of numbers is = "+sum);
        System.out.println("the subtract of numbers is ="+sub);
        System.out.println("the multi of numbers is="+mul);
        System.out.println("the divide of numbers is ="+div);
    }



    }

