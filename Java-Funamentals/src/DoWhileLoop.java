import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        do {
            int n= input.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
        }
}
