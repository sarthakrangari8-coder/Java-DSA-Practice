import java.util.Scanner;

public class StringPermutation {
    static void Permutation(char[]ar,int fix){
        if (fix== ar.length-1){
            System.out.println(ar);
            return;
        }
        for (int i=fix;i<ar.length;i++){
            swap(ar,i,fix);
            Permutation(ar,fix+1);
            swap(ar,i,fix);

        }
    }
    static void swap(char[]ar,int i,int fix){
        char temp=ar[i];
        ar[i]=ar[fix];
        ar[fix]=temp;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s= input.next();
        Permutation(s.toCharArray(),0);
    }
}
