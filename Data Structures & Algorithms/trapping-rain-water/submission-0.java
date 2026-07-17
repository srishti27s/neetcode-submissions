class Solution {
    public int trap(int[] height) {
        int answer =0;

        for(int i =0;i<height.length-1;i++){
          int leftMax=0;
          for(int j = 0; j<=i;j++){
            leftMax=Math.max(leftMax,height[j]);

          }
          int rightMax=0;{
            for(int j = height.length-1 ; j>=i;j--){
              rightMax=Math.max(rightMax,height[j]);
            }
                answer += Math.min(leftMax, rightMax) - height[i];

          }
        }
        return answer;
    }
}