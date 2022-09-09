import java.util.*;
class Main {
  public static List<Integer> insertionSort(int arr[]){
    List<Integer> l=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++){
      l.add(arr[i]);
      for(int j=l.size()-1;j>0;j--){
        if(l.get(j)>=l.get(j-1)){
          break;
        }
        int temp=l.get(j);
        l.set(j,l.get(j-1));
        l.set(j-1,temp);
      }
    }
    return l;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    List<Integer> l= insertionSort(arr);
    for(int i : l){
      System.out.print(i+" ");
    }
    sc.close();
  }
}


/*
TC : 
----
Best Case : O(N) // Array elements are comming in sorted way
Worst Case : O(N^2) // Array sorted in reverse order
Avg Case : O(N^2) // Array in random order
Use Cases
--------
query related problems. ex find meian with updating values reqularly 
*/
