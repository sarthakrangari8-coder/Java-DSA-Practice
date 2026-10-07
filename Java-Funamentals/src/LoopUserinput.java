import java.util.Scanner;

public class LoopUserinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter any number : ");
        int num= input.nextInt();
        int counter =1;

        while (counter<=num){
            System.out.println(counter);
            counter++;
        }
    }
}
