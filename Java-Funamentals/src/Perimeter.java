import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter all 4 sides in cms");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        double d= input.nextDouble();
        double area = a+b+c+d;
        System.out.println("The perimeter of rectangle is "+area);


    }


}
