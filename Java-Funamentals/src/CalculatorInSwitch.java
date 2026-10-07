import java.util.Scanner;

public class CalculatorInSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to  mini calculator !");
        System.out.println("please enter your first number =");
        int firstNum= input.nextInt();
        System.out.println("now please enter your second number =");
        int secondNum= input.nextInt();
        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(firstNum+secondNum);
                break;
            case'-':
                System.out.println(firstNum-secondNum);
                break;
            case'*':
                System.out.println(firstNum*secondNum);
                break;
            case'/':
                System.out.println(firstNum/secondNum);
                break;
            default:
                System.out.println("Sorry! we can't find input !");


        }
    }
}
