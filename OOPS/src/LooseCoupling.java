import java.util.Scanner;

interface Payment {
    void pay();
}


class UpiPyment implements Payment{
    public void pay(){
        System.out.println("payed using UPI");
    }
}
class NetBankingPyment implements Payment{
    public void pay(){
        System.out.println("payed using NetBanking ");
    }
}
class CheckOut{
    void processPayment(Payment payment){
        payment.pay();
    }
}



public class LooseCoupling {
    public static void main(String[] args) {

      Payment upi =new UpiPyment();
      Payment netBanking=new NetBankingPyment();

      CheckOut checkOut=new CheckOut();

        System.out.println("1.Pay using UPI");
        System.out.println("2.Pay using NetBanking");

        Scanner input =new Scanner(System.in);
        int user_input = input.nextInt();

        switch (user_input){
            case 1:
                checkOut.processPayment(upi);
                break;
            case 2:
                checkOut.processPayment(netBanking);
                break;
            default:
                System.out.println("Invalid Input !");

        }

    }
}
