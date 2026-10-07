interface A1{
     void eat();

}
interface A2{

      void run();
}
class C1 implements A1,A2{
    public void run(){
        System.out.println("on two legs");
    }

     public void eat(){
        System.out.println("eat with mouth");
    }


}



public class MultipleInheritance {
    public static void main(String[] args) {
        C1 C1=new C1();
        C1.run();
        C1.eat();
    }


}
