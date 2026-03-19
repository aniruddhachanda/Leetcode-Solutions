class Solution {
    public int maxProduct(int[] nums) {
        int currmax=nums[0];
        int currmin=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];

            int temp=currmax;
            currmax=Math.max(num,Math.max(currmax*num,currmin*num));
            currmin=Math.min(num,Math.min(temp*num,currmin*num));

            res=Math.max(res,currmax);
        }
        return res;
    }
}