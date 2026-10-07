import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("welcome to result portal !");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.println("Now,enter your marks: ");
        int marks= input.nextInt();
        System.out.println(">>>>Student Progress Info<<<<");
        System.out.println("Name : " + name);
        System.out.println("Marks : "+ marks);
        
        if (marks >90){
            System.out.println("Performance:Excellent!");
            System.out.println("Grade:A");
        }else if (marks>=75 && marks<=89){
            System.out.println("Performance: Very Good!");
            System.out.println("Grade:B");
        }else if (marks>=60 && marks<=70){
            System.out.println("Performance:Good!");
            System.out.println("Grade:C");
        }else if (marks>=40 && marks<=59){
            System.out.println("Performance:Average!");
            System.out.println("Grade:D");
        }else{
            System.out.println("Performance:Fail");
            System.out.println("Grade:F");
        }
        
        
    }
}
