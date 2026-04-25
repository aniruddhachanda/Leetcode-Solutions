class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        total=(n*(n+1))/2;
        return (total-sum);
    }
}