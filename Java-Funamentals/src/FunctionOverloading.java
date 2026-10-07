public class FunctionOverloading {
    //overloading peremeters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //prime or not in function
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    // prime number  in range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum) {
        int myNum = binNum;   // store original number
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n) {
        int nyNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + nyNum + " =" + binNum);
    }

}














