class Solution {
    public int countSetBits(int n){
        int count=0;
        for(int i=0;(n>>i)!=0;i++){
            if((n&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        int ind=0;
        for(int i=0;i<=n;i++){
            arr[ind++]=countSetBits(i);
        }
        return arr;
    }
}
