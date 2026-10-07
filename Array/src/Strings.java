import java.sql.SQLOutput;
import java.util.Scanner;
public class Strings {
    public static void PrintLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
    }
        // Input in String
//        Scanner input =new Scanner(System.in);
//        String name;
//        name=input.nextLine();
//        System.out.println(name);

        //Find length in java
//        String fullName="sarthak rangari";
//        System.out.println(fullName.length());

        // concatenation
        public static void main(String[] args) {
            String firstName="sarthak";
            String secondName="rangari";
            String fullName=firstName +" "+ secondName;



            PrintLetters(fullName);
        }

    }


