class Solution {
    public int lowerBound(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int arr[],int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);
        if(lb==nums.length||nums[lb]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{lb,ub-1};
    }
}