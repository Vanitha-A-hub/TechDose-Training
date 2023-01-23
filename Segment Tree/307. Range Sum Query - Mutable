class NumArray {
    int seg_tree[];
    int Nums[];
    public void buildSegTree(int st_index,int[] nums,int low,int high)
    {
        if(low == high)
        {
            seg_tree[st_index] = nums[low];
            return;
        }
        if(low > high)
        {
            return;
        }

        int mid = low + (high-low)/2;
        buildSegTree(st_index*2,nums,low,mid);
        buildSegTree(st_index*2+1,nums,mid+1,high);
        seg_tree[st_index] = seg_tree[st_index*2]+seg_tree[st_index*2+1];
    }
    public NumArray(int[] nums) {
        int n = nums.length;
        Nums = Arrays.copyOf(nums,n);
        seg_tree = new int[4*n+1];
        buildSegTree(1,nums,0,n-1);
    }
    
    public void update(int index, int val) {
        Nums[index] = val;
        update_sum(1,0,Nums.length-1,index,val);
    }
    
    public void update_sum(int st_index,int start,int end,int index,int val)
    {
        if(start > index || end < index)
        {
            return ;
        }
        if(start == end)
        {
            seg_tree[st_index] = val;
            return ;
        }
        int mid = start + (end-start)/2;
        update_sum(st_index*2,start,mid,index,val);
        update_sum(st_index*2+1,mid+1,end,index,val);
        seg_tree[st_index] = seg_tree[st_index*2]+seg_tree[st_index*2+1];
    }

    public int sumRange(int left, int right) {
        return findSum(left,right,1,0,Nums.length-1);
    }
    public int findSum(int qs,int qe,int start,int s,int e)
    {
        if(qs > e || qe < s)
        {
            return 0;
        }
        if(s >= qs &&  e <= qe)
        {
            return seg_tree[start];
        }
        int mid = s + (e-s)/2;
        int left = findSum(qs,qe,start*2,s,mid);
        int right = findSum(qs,qe,start*2+1,mid+1,e);
        return left+right;
    }
}
