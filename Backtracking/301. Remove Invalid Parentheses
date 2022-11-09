class Solution {
    Map<Integer,List<String>> map = new HashMap<>();
    int max = 0;
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        helper(s,0,"",s.length(),0,0);
        // System.out.println(map.get(max));
        return map.get(max);
    }
    public void helper(String s,int start,String curr,int n,int o,int c)
    {
        if(start == n)
        {
            if(o == c && o+c >= max){
                if(map.containsKey(o+c))
                {
                    List<String> l = map.get(o+c);
                    if(!l.contains(curr))
                    l.add(curr);
                    map.put(o+c,l);
                }
                else{
                    List<String> l = new ArrayList<>();
                    l.add(curr);
                    map.put(o+c,l);
                }
                
                max = Math.max(max,o+c);
            // System.out.println(curr +" "+o+" "+c);
            }
            return;
        }
        if(o<c)
        {
            return;
        }
        int t = 1;
        int open = 0,close = 0;
        if(s.charAt(start) == '(')
        {
            open = 1;
        }
        else if(s.charAt(start) == ')')
        {
            close = 1;
        }
        else
        {
            t = 0;
        }
        if(start < n){
            if(t==1){
        helper(s,start+1,curr,n,o,c);
            }
        helper(s,start+1,curr+""+s.charAt(start),n,o+open,c+close);
        }
    }
}
