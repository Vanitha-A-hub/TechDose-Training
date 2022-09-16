import java.util.*;
class Main{
  public static int findMax(int[] a){
    int max=0;
    for(int i=0;i<a.length;i++){
      if(max<a[i]){
        max=a[i];
      }
    }
    return max;
  }
  public static int findLen(int n){
    int len=0;
    while(n>0){
      len++;
      n/=10;
    }
    return len;
  }
  public static void bucketSort(int[] a){
    int max=findMax(a);
    int maxLen=findLen(max);
    for(int ctr=0;ctr<maxLen;ctr++){
      List<Integer> bucket[]=new List[10];
      for(int i=0;i<10;i++){
        bucket[i]=new LinkedList<>();
      }
      for(int num:a){
        (bucket[(num/(int)Math.pow(10,ctr))%10]).add(num);
      }
      int index = 0;  
      for(List<Integer> b : bucket)  
      {  
        for(int num : b)  
        {  
          a[index++] = num;  
        }
      }
    }  
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    bucketSort(a);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}
