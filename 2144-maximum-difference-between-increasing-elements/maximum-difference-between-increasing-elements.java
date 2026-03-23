class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int maxDiff=-1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>min){
                int ans=nums[j]-min;

                maxDiff=Math.max(maxDiff,ans);
            }
            min=Math.min(min,nums[j]);
        }
        return maxDiff;
    }
}