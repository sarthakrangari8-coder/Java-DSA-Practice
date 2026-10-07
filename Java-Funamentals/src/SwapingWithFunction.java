public class SwapingWithFunction {
    //swapping in function
    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }


    //product in function
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

// factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n,int r){
       int fact_n=factorial(n);
       int fact_r=factorial(r);
       int fact_nmr=factorial(n-r);

       int binCoeff=fact_n/(fact_r*fact_nmr);
       return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5,2));
    }
 }
