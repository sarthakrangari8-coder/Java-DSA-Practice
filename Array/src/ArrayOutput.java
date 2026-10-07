import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner input = new Scanner(System.in);
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math:" + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage);
        System.out.println("length of array = " + marks.length);

    }
}
