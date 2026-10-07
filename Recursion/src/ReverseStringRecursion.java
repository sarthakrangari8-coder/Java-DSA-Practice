import java.util.Scanner;

public class ReverseStringRecursion {
    static String ReverseString(String s,String ns ,int i){
        if (i<0){
            return ns;
        }
        return ReverseString(s,ns+s.charAt(i),i-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the name : ");
        Scanner input =new Scanner(System.in);
        String s= input.nextLine();
        System.out.println(ReverseString(s,"",s.length()-1));
    }
}
