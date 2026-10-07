import java.util.Scanner;

public class PalindromeInRecursion {
    static boolean palindrome(String s,int start ,int end){
        if (start>=end){
            return true;
        }
        if (s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return palindrome(s,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println("Please enter a name : ");
        Scanner input =new Scanner(System.in);
        String s= input.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));
    }
}
