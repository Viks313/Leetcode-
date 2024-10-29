class Solution {
    public int maxSubArray(int[] nums) {
       
      int curSum=0;
      int maxSum=nums[0];
       for(int val:nums){
        curSum+=val;
       // maxSum=Math.max(curSum,maxSum);
         maxSum = curSum> maxSum? curSum : maxSum ;
        if(curSum<0){
            curSum=0;
        }
       }
    return maxSum;
    }
}