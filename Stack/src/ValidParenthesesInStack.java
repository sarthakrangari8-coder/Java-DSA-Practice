import java.util.Stack;
class ValidParenthesesInStack {
    public boolean isValid(String s){
        Stack<Character>at=new Stack<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);


            if (ch=='(') at.push(')');
            else if (ch=='{') at.push('}');
            else if (ch =='[')at.push(']');

            else if (at.isEmpty() || at.pop() !=ch) return false;
        }
        return at.isEmpty();
    }

    public static void main(String[] args) {

        ValidParenthesesInStack obj=new ValidParenthesesInStack();

        String s="{[()}}";

        boolean result=obj.isValid(s);
        System.out.println(result);


    }
}
