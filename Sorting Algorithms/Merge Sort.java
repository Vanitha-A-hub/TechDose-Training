import java.util.Scanner;
class Main {
  public static void merge(int arr[],int low,int mid,int high){
    int i=low,j=mid+1,k=low;
    int m[]=new int[high+1];
    while(i<=mid && j<=high){
      if(arr[i]<arr[j]){
        m[k++]=arr[i++];
      }else{
        m[k++]=arr[j++];
      }
    }
    while(i<=mid) {
      m[k++]=arr[i++];
    }
    while(j<=high){
      m[k++]=arr[j++];
    }
    for(int ind=low;ind<=high;ind++){
      arr[ind]=m[ind];
    }
  }
  
  public static void mergeSort(int[] arr,int low,int high){
    if(high==low) return;
    int mid=low+(high-low)/2; // 
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    mergeSort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}

/*
TC :
Best : O(Nlog(N))
Worst : O(Nlog(N))
Avg : O(Nlog(N))
SC : O(Nlog(N))
Not depend on input nature
*/
