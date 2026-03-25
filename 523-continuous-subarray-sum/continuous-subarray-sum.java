class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int prefix=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];

            int remainder = prefix % k;
            if(remainder<0){
                remainder+=k;
            }

            if(map.containsKey(remainder)){
                if((i-map.get(remainder))>1){
                    return true;
                }
            }
            else{
                map.put(remainder,i);
            }
        }
        return false;
    }
}