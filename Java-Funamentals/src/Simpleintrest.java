import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        System.out.println("welcome to simple interest calculator");
        Scanner input =new Scanner(System.in);
        System.out.println("please enter your principle amount rs");
        int principle= input.nextInt();
        System.out.println("now tell me your rate of interest:");
        float rate = input.nextFloat();
        System.out.println("now tell me how many years you borrowing this money");
        float years= input.nextFloat();

        float interest=(principle*rate*years)/100;
        System.out.println("your simple interest is Rs"+interest);


    }

}
