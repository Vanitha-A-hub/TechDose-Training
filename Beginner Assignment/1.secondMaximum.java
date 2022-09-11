//array size>=2 

import java.util.Scanner;
class Main {
  public static int secondMaximum(int[] arr){
    int fMax,sMax;
    if(arr[0]>arr[1]){
      fMax=arr[0];
      sMax=arr[1];
    }else{
      fMax=arr[1];
      sMax=arr[0];
    }
    for(int i=2;i<arr.length;i++){
      if(arr[i]>fMax){
        sMax=fMax;
        fMax=arr[i];
      }else if(arr[i]>sMax){
        sMax=arr[i];
      }
    }
    return sMax;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.print(secondMaximum(arr));
    sc.close();
  }
}
