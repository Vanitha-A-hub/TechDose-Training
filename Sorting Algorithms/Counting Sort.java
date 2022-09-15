import java.util.Scanner;
class Main {
  public static int findMax(int[] a){
    int max=0;
    for(int i=0;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }
    }
    return max;
  }
  public static void countingSort(int[] a){
    int max=findMax(a);
    int freq[]=new int[max+1];
    for(int i=0;i<a.length;i++){
      freq[a[i]]++;
    }
    for(int i=1;i<max+1;i++){
      freq[i]+=freq[i-1];
    }
    int m[]=new int[a.length];
    for(int i=0;i<a.length;i++){
      freq[a[i]]--;
      m[freq[a[i]]]=a[i];
    }
    for(int i=0;i<a.length;i++){
      a[i]=m[i];
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    countingSort(a);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}   
