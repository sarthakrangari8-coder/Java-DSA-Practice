import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        System.out.println("Welcome to driving license portal ");
        System.out.println("Please,enter your age : ");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible to drive");
        }else{
            System.out.println("YOu are not eligible to drive ");
        }
    }
}
