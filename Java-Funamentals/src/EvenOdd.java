import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter your number : ");
        int num=input.nextInt();

        if (num %2 == 0){
            System.out.println("Your number is odd  ! ");
        }else{
            System.out.println("Your number is even ! ");
        }
    }
}
