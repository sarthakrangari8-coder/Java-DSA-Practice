import java.util.Scanner;

public class PhoneKeypadCombinations {
   static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };



   static void possibleWords(String s, String ans) {
      if (s.length() == 0) {
         System.out.println(ans);
         return;
      }
      String key = keypad[s.charAt(0) - 48];
      for (int i = 0; i<key.length(); i++){
         possibleWords(s.substring(1), ans + key.charAt(i));
      }
   }

   public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println("Enter digits (2-9): ");
      String s= input.nextLine();
      possibleWords(s,"");
      
   }
}





