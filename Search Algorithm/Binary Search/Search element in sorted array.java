import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int a[] = new int[N];
	    for(int i=0;i<N;i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    int K = sc.nextInt();
	   //int a[] = {1,2,3,4,5};
	   //int K = 4;
	    System.out.println(BinarySearch(a,K));
	}
	public static int BinarySearch(int a[],int k)
	{
	    int l = a.length;
	    int s = 0;
	    int e = l-1;
	    while(s<=e)
	    {
	        int mid = s + (e-s)/2;
	        System.out.println(s+" "+e);
	        if(a[mid] == k)
	        {
	            return 1;
	        }
	        else if(a[mid] < k)
	        {
	            s = mid + 1;
	        }
	        else{
	            e = mid - 1;
	        }
	    }
	    return 0;
	}
}

// TC:
// BC = O(1)
// WC = O(logN)
