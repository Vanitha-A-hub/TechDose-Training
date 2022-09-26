class Solution {
    public int uniqueLetterString(String s) {
        ArrayList<Integer> a[]=new ArrayList[26];
        for(int i=0;i<26;i++){
            a[i]=new ArrayList<Integer>();
            a[i].add(-1);
        }
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'A';
            a[val].add(i);
        }
        for(int i=0;i<26;i++){
            a[i].add(s.length());
        }
        int c=0;
        for(int i=0;i<26;i++){
            for(int j=1;j<a[i].size()-1;j++){
                c+=(a[i].get(j)-a[i].get(j-1))*(a[i].get(j+1)-a[i].get(j));
            }
        }
        return c;
    }
}
