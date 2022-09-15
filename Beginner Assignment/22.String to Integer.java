class Solution {
    public int myAtoi(String s) {
        int ind=0,res=0,sign=1;
        if(s.length()==0) return 0;
        while(ind<s.length() && s.charAt(ind)==' '){
            ind++;
        }
        if(ind<s.length() && s.charAt(ind)=='+'){
            sign=1;
            ind++;
        }else if(ind<s.length() && s.charAt(ind)=='-'){
            sign=-1;
            ind++;
        }
        while(ind<s.length()){
            int digit=s.charAt(ind)-'0';
            if(digit<0 || digit>9){
                break;
            }
            if(Integer.MAX_VALUE/10 < res || (Integer.MAX_VALUE/10==res && Integer.MAX_VALUE%10 < digit)){
                return (sign==1)? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=(res*10)+digit;
            ind++;
        }
        return res*sign;
    }
}
