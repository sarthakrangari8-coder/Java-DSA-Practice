public class Interfaces {
    abstract class Test{
        void m1(){
            System.out.println("m1() method in class test1");
        }

        abstract void m2();
    }

    interface I1{

        void pay();


    }
    class UpiPayment1 implements I1{
        @Override
        public void pay() {
            System.out.println("pay using upi");
        }
    }

}
