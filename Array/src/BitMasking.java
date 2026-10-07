public class BitMasking {
    //substrings
//    public static void main(String[] args) {
//       String str="HelloWorld";
//        System.out.println(str.substring(0,5));
//    }
//    public static void main(String[] args) {
//        int a=3,b=7;
//        System.out.println(a<<1 );
//    }
    //odd even in bit
    public static void OddAndEven(int n) {
        int bitMast = 1;
        if ((n & bitMast) == 0) {
            System.out.println("Number is even !");
        } else {
            System.out.println("Number is odd !");
        }
    }
    //set Ith bit
    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    //clear bit
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    //update bit
    public static int updateIthBit(int n,int i,int newBit){
        if (newBit==0){
            return clearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }
    }
    // clear last bit
    public static int clearIBet(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearBitRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask =a|b;
        return n & bitmask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static int countSetBit(int n){
        int count=0;
        while (n>0){
            if ((n&1)!=0){
                count++;
            }
          n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans =ans *a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;

    }






        public static void main (String[]args){
//        Scanner input =new Scanner(System.in);
//        System.out.println("Please enter your number = ");
//        int n= input.nextInt();
//        OddAndEven(n);
           // System.out.println(clearBitRange(10,2,4));
            //System.out.println(countSetBit(16));
            System.out.println(fastExpo(3,5));
//
        }



}

