import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = input.nextLine();
        System.out.println("good moring "+name);
        System.out.println(name +"also tell me your age ");
        int age= input.nextInt();
        System.out.println("your age is "+age);

    }
}
