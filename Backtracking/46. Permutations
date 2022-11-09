class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permutation(nums,0,nums.length-1,res);
        return res;
    }
    public void permutation(int[] nums,int l,int r,List<List<Integer>> res)
    {
        if(l == r)
        {
            List<Integer> n = new ArrayList<>();
            for(int i=0;i<=r;i++)
            {
                n.add(nums[i]);
            }
            res.add(n);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            swap(nums,i,l);
            permutation(nums,l+1,r,res);
            swap(nums,i,l);
        }
    }
    public void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
