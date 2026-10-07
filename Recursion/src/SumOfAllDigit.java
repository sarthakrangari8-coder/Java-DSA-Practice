import java.util.Scanner;

public class SumOfAllDigit {
    static int SumOfAll(int n){
        if (n==0){
            return 0;
        }
        int d=n%10; //last digit
         n= n/10; // remining digit
         int ans =SumOfAll(n); // we want  answer  of remining digit
         return d+ans;
    }

    public static void main(String[] args) {
        System.out.println("Please enter any number :");
        Scanner input =new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(SumOfAll(n));
    }
}
