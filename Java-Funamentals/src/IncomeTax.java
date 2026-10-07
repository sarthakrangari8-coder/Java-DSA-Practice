import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        System.out.println("welcome to income tax calculator !");
        Scanner input = new Scanner(System.in);
        System.out.print("please,enter your income rs");
        int income= input.nextInt();
        double tax;

         if( income<500000 ){
            tax=0;
        }else if (income <1000000){
             tax=income *0.2;
         }
        else{
            tax=income*0.3;
        }
        System.out.print("your income rs ="+income);
        System.out.println("your,tax to pay is rs="+tax);


    }
}
