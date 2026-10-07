public class Abstraction {
    abstract class Animal{
        void eat(){
            System.out.println("animals eat");
        }
        abstract void walk();

    }
   static class horse extends animal{
        void walk(){
            System.out.println("walks of 4 legs");
        }
    }
    static class chicken extends animal{
        void walk(){
            System.out.println("walks of 2 legs");
        }
    }

    public static void main(String[] args) {
       horse h=new horse();
       h.eat();
       h.walk();

       chicken c=new chicken();
       c.eat();
       c.walk();
    }
}

