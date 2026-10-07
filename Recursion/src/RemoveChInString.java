public class RemoveChInString {
    static String RemoveCh(String s, int i,int n, char c) {
        if (i == n) {
            return "";
        }
        String ans = RemoveCh(s,i+1,n,c );
        if (s.charAt(i) == c) {
            return ans;
        }
        return s.charAt(i)+ans;
    }

    public static void main(String[] args) {
        String s="cat";
        char c='a';
        System.out.println(RemoveCh(s,0,s.length(),c));
    }
}