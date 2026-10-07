import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to percentage calculator ! ");
        System.out.println("enter your percentage : ");
        float percentage= input.nextInt();

        if(percentage>=90){
            System.out.println("great,you have got A");
        }else if(percentage>=75){
            System.out.println("Good,you got B ");
        }else if(percentage>=30){
            System.out.println("you got D, you need to work harder !");
        }else{
            System.out.println("Sorry,you have fail ,you need to take study serisly !");
        }
    }

}
