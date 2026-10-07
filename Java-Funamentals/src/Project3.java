import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num=(int)(Math.random()*100)+1;
        int guess=0;
        System.out.println("Guess the number between 1 to 100");
        while (guess!=num){
            System.out.print("Enter your guess : ");
            guess=input.nextInt();
            if (guess>num){
                System.out.println("Too High !!!");
            } else if (guess<num) {
                System.out.println("Too low !!!");
            }else{
                System.out.println("Correct guess ! your are great !!");
            }

        }


    }
}
