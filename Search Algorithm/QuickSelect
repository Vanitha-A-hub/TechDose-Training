class Solution {
    public int findKthLargest(int[] nums, int k) {
        return QuickSelect(nums,nums.length-k,0,nums.length-1);
    }
    public static int QuickSelect(int[] nums,int k,int l,int h)
    {
        while(l<h){
        int p = Sort(nums,l,h);
            if(p<k)
            {
                l = p+1;
                
            }
            else if(p>k)
            {
                h = p-1;
            }
            else
            {
                return nums[p];
            }
        }
        return nums[l];
        
    }
    public static int Sort(int[] nums,int l,int h)
    {
        int i = l-1;
        int pivot = nums[h];
        for(int j=l;j<h;j++)
        {
            if(nums[j] < pivot)
            {
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,h);
        return i+1;
    }
    public static void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

// Time Complexity:
// BC = o(N)
// WC = O(N^2)  
