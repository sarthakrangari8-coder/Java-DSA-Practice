import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Student Management System");

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();

        System.out.print("Enter student marks: ");
        int marks = input.nextInt();

        System.out.println("\n----- Student Report -----");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        }else
            System.out.println("Result: Fail");
    }
}