class Solution {
    public int countSetBits(int ans){
        int count=0;
        for(int i=0;(ans>>i)!=0;i++){
            if((ans&(1<<i))!=0){
                count++;
            }
        }
        return count;
    }
    public int hammingDistance(int x, int y) {
        int ans=x^y;
        return countSetBits(ans);
    }
}
