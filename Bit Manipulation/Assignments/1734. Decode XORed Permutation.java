class Solution {
    public int[] decode(int[] encoded) {
        int ans[]=new int[encoded.length+1];
        int totXOR=0,x=0,f=0;
        for(int i=1;i<=encoded.length+1;i++){
            totXOR^=i;
        }
        for(int i=1;i<encoded.length;i+=2){
            x^=encoded[i];
        }
        f=x^totXOR;
        ans[0]=f;
        for(int i=1;i<encoded.length+1;i++){
            f=f^encoded[i-1];
            ans[i]=f;
        }
        return ans;
    }
}
