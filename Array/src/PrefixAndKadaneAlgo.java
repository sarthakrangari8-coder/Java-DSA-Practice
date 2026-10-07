public class PrefixAndKadaneAlgo {
    public static void main(String[] args) {
        int num[]={2,4,5,6,7};
        int prefix[]=new int[num.length];

        prefix[0]=num[0];

        for (int i=1;i< num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for (int i=0;i<num.length;i++){
            System.out.println(prefix[i]+" ");
        }
    }

}
