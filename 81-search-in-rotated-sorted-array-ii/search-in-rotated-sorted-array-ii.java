class Solution {
    public boolean search(int[] nums, int target) {
        boolean isPresent=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                isPresent=true;
            }
        }
        return isPresent;
    }
}