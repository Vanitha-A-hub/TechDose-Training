import java.util.*;
class Main {
  public static int findMax(int[] a){
    int max=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    return max;
  }
  public static int maxLen(int a){
    int len=0;
    while(a>0){
      len++;
      a/=10;
    }
    return len;
  }
  public static void radixSort(int[] a,int count){
    int ctr=0;
    while(count>ctr){
      int freq[]=new int[10];
      for(int i=0;i<a.length;i++){
        freq[(a[i]/(int)Math.pow(10,ctr))%10]++;
      }
      for(int i=1;i<10;i++){
        freq[i]+=freq[i-1];
      }
      int m[]=new int[a.length];
      for(int i=a.length-1;i>=0;i--){
        freq[a[i]/(int)Math.pow(10,ctr)%10]--;
        m[freq[a[i]/(int)Math.pow(10,ctr)%10]]=a[i];
      }
      for(int i=0;i<a.length;i++){
        a[i]=m[i];
      }
      ctr++;
    }    
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int max=findMax(a);
    int count=maxLen(max);
    radixSort(a,count);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}
