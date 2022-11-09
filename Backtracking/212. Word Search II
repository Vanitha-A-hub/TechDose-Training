class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        int r = board.length;
        int c = board[0].length;
        List<String> res = new ArrayList<>();
        TrieNode root = build(words);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                dfs(board,words,root,res,i,j);
            }
        }
        return res;
    }
    public void dfs(char[][] board,String[] words,TrieNode root,List<String> res,int r,int c)
    {
        char ch = board[r][c];
        if(ch == '1' || root.next[ch-'a'] == null)
        {
            return;
        }
        root = root.next[ch-'a'];
        if(root.word != null)
        {
            res.add(root.word);
            root.word = null;
        }
        board[r][c] = '1';
        if(r>0)
        {
            dfs(board,words,root,res,r-1,c);
        }
        if(c>0)
        {
            dfs(board,words,root,res,r,c-1);
        }
        if(r<board.length-1)
        {
            dfs(board,words,root,res,r+1,c);
        }
        if(c<board[0].length-1)
        {
            dfs(board,words,root,res,r,c+1);
        }
        board[r][c] = ch;
    }
    public TrieNode build(String[] words)
    {
        TrieNode root = new TrieNode();
        for(String str:words)
        {
            TrieNode p = root;
            for(char a:str.toCharArray())
            {
                if(p.next[a-'a'] == null)
                {
                    p.next[a-'a'] = new TrieNode();
                }
                p = p.next[a-'a'];
            }
            p.word = str;
        }
        return root;
    }
    class TrieNode
    {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
}
