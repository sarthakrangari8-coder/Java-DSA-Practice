import javax.swing.*;

public class PatternAdvancedQue {
    public static void hollow_rectangle(int totRow ,int totCols ){
        for (int i=1;i<=totRow;i++){
            for (int j=1;j<=totCols;j++){
                if (i==1 ||i==totRow || j==1 ||j==totCols ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_Half_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public  static void inverted_number_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
    public static void FloydTringle(int n){
        int counter =1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

    }
    public static void zero_one_Tringle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //First part (1 to n)
        for (int i=1;i<=n;i++){
          //stars - i
          for (int j=1;j<=i;j++){
              System.out.print("* ");
          }
          //spaces-2*(n-1)
          for (int j=1;j<=2*(n-i);j++){
              System.out.print("  ");
          }
          //stars-i
          for (int j=1;j<=i;j++) {
              System.out.print("* ");
          }
            System.out.println();
        }
       //Second part (n to 1)

        for (int i=n;i>=1;i--){
            //stars - i
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces-2*(n-1)
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars-i
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void numberPyramid(int n) {
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    public static void palindromePmid(int n){
        for (int i=1;i<=n;i++){
           //spaces
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //descending order
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
        //ascending order
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }



        public static void main(String[] args) {
       // hollow_rectangle(4,5);
       // inverted_Half_pyramid(6);
       // inverted_number_pyramid(4);
        //FloydTringle(5);
       // zero_one_Tringle(6);
       // butterfly(4);
       // solid_rhombus(5);
        //hollow_rhombus(5);
      //  diamond(4);
       // numberPyramid(5);
            palindromePmid(5);
    }

}
