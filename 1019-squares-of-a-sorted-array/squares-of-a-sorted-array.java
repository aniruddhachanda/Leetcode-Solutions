class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int leftSqure=nums[left]*nums[left];
            int rightSqure=nums[right]*nums[right];
            if(leftSqure>rightSqure){
                result[index]=leftSqure;
                left++;
            }
            else{
                result[index]=rightSqure;
                right--;
            }
            index--;
        }
        return result;
    }
}