import java.util.Scanner;
class Main {
  public static int[] selectionSort(int[] arr){
    for(int i=0;i<arr.length-1;i++){
      int minInd=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[minInd]>arr[j]){
          minInd=j;
        }
      }
      int temp=arr[minInd];
      arr[minInd]=arr[i];
      arr[i]=temp;
    }
    return arr;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    arr=selectionSort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}

/*
Time Complexity 
-----------------
Best Case : O(N^2)
Worst Case : O(N^2)
Average Case : O(N^2)
So not depend on nature of the input
*/
