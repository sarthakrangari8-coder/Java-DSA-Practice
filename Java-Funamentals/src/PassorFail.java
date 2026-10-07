import java.util.Scanner;

public class PassorFail {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please,enter your marks : ");
        int marks= input.nextInt();
        String Rc=marks>=33?"pass":"fail";
        System.out.println(Rc);
    }
}
