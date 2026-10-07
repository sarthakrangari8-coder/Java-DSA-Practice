import java.util.Scanner;

public class Fahreneit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to fahreneit calculator !");
        System.out.println("Enter your tem in f : ");
        float fah=input.nextFloat();
        float cel =(fah-32)*5/9;
        System.out.println("your temp is :"+cel);

    }

}
;