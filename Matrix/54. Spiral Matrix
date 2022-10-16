class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
        {
            return new ArrayList();
        }
        int x = matrix.length,y = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bot = x-1;
        int left = 0;
        int right = y-1;
        while(list.size()< (x*y))
        {
            for(int i=left;i<=right && list.size()<x*y;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot && list.size()<x*y;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            for(int i=right;i>=left && list.size()<x*y;i--)
            {
                list.add(matrix[bot][i]);
            }
            bot--;
            for(int i=bot;i>=top && list.size()<x*y;i--)
            {
                list.add(matrix[i][left]);
            }
            left++;
            
        }
        return list;
    }
}
