class Solution {
    public int differenceOfSums(int n, int m) {
        int divisable=0;
        int nondivisable=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                divisable+=i;
            }
            else{
                nondivisable+=i;
            }
        }
        return nondivisable-divisable;
    }
}