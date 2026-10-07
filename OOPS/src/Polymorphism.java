public class Polymorphism {
    public static void main(String[] args){
//       Test t= new Test();
//       t.show();ll);
        Test2 t=new Test2();
        t.show();
        Xyz x=new Xyz();
        x.show();



    }
    static class Test{
        void show(int a,String b){
            System.out.println("1");
        }
        void show(String a ,int b){
            System.out.println("2");
        }
    }

    //Automatic Promotion
    static class Case1{
        void show(StringBuffer a){
            System.out.println("int method");
        }
        void show(String a){
            System.out.println("string method");
        }

    }
    //method overriding
     static class Test2{
        Object show(){
            System.out.println("1");
            return null;
        }
    }
    static class Xyz extends Test2{
        String show(){
            System.out.println("2");
            return null;
        }
    }






}
