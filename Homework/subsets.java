/*
input:
3
1 2 3

output:
0
1
2
1 2
3
1 3
2 3
1 2 3

*/

import java.util.*;
class Main {
  
  public static String[] subset(int[] arr,int n){
    String res[]=new String[(1<<n)];
    int resInd=0;
    int curr[]=new int[n];
    int currInd=0;
    for(int i=0;i<(1<<n);i++){
      currInd=0;
      curr=new int[n];
      for(int j=0;j<n;j++){
        if((i&(1<<j))!=0){
          curr[currInd++]=arr[j];
        }
      }
      res[resInd++]=Arrays.toString(curr);
    }
    return res;
  }

  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    String res[]=subset(arr,n);
    for(int i=0;i<res.length;i++){
      for(int j=1;j<(n*3);j+=3){
        //i=0 and j=1 is to print the subset empty (0)
        if((i==0 && j==1)|| Integer.parseInt(String.valueOf(res[i].charAt(j)))!=0){
          System.out.print((res[i]).charAt(j)+" ");
        }
      }
      System.out.println();
    }
  }
}
