import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to greatest number detector !");
        System.out.println("Enter the first number :");
        int first= input.nextInt();
        System.out.println("Enter the second number :");
        int second= input.nextInt();
        System.out.println("Enter the third number :");
        int third= input.nextInt();

        if(first>=second && first>=third){
            System.out.println(first+"is the greater");
        }else if (second>=third){
            System.out.println(second+"id the greater");
        }else{
            System.out.println(third+"is the greater");
        }
    }
}
