 class TrappingWater {
    public int trapRainWater(int []height){
        int left=0,right=height.length-1;
        int leftMax=0 , rightMax=0,water=0;

        while (left<right){
            if (height[left]<height[right]){
                leftMax=Math.max(leftMax,height[left]);

                water +=leftMax-height[left];

                left++;
            }else{
                rightMax=Math.max(rightMax,height[right]);

                water +=rightMax-height[right];

                right--;
            }

        }
        return water;
    }

     public static void main(String[] args) {
         int [] height={5,2,1,2,4,6};

         TrappingWater obj=new TrappingWater();

         int ans=obj.trapRainWater(height);

         System.out.println(ans);
     }

}
