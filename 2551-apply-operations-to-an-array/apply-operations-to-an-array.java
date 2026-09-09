class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;

                left++;
            }
        }
        return nums;
    }
}