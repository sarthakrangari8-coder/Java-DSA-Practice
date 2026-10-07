import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Welcome to compound interest calculator !");
        System.out.print("\nEnter your principle amount Rs ");
        int principal= input.nextInt();
        System.out.println("Now,tell me your rate of interest : ");
        float rate= input.nextFloat();
        System.out.println("Now,tell me how many years are you borrowing money :");
        float years= input.nextFloat();

        double compound = principal * Math.pow((1+rate /100),years);
        System.out.println("your compound interest is Rs"+compound);
    }
}
