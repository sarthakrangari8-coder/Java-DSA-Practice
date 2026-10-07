//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
   public class Main {
    //public static void main(String args[]) {
//        Pen p1 =  new  Pen();
//        p1.setColor("blue");
//        System.out.println(p1.color);
//        p1.setTip(5);
//        System.out.println(p1.tip);
//        p1.setColor("yellow");
//        System.out.println(p1.color);

    public static void main(String args[]) {
        //StudentA s1=new StudentA();
        //System.out.println(s1.name);
//        Fish shark =new Fish();
//        shark.eat();
        Employee e1=new Employee("sarthak",101);
        Employee e2=new Employee("pratik",102);
        System.out.println("Employee 1 :"  +e1.name+" "+ e1.emp_id);
        System.out.println("Employee 2 :" +e2.name+" "+e2.emp_id);
    }



// Constructor ex.
}
class Employee{
    String name;
    int emp_id;
    Employee(String name,int emp_id){
        this.name=name;
        this.emp_id=emp_id;
    }


}


  class Pen{
    String color;
    int tip;

       void setColor(String newColor){
          color=newColor;
      }
      void setTip(int newTip){
           tip=newTip;
      }

  }
  class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

  }
  class StudentA{
    String name ;
    int roll;

    StudentA(){
        System.out.println("Daddy,s Homeee !");
    }


  }
  //inheritance
//base class
class animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }

  }
  //derived Class
class Fish extends animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
  }

