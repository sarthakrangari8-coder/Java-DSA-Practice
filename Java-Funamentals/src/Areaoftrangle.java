import java.util.Scanner;

public class Areaoftrangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the base in cms:");
        double base= input.nextDouble();
        System.out.println("enter your perpendicular height in cms: ");
        double height= input.nextDouble();

        double area=0.5*base*height;
        System.out.println("the area of trangle is : "+area+"cms");
    }
}
