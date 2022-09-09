import java.util.Scanner;
class Main {
  public static int[] bubbleSort(int arr[]){
    int flag=0;
    for(int i=arr.length-1;i>=0;i--){
      for(int j=0;j<i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          flag=1;
        }
      }
      if(flag==0){
        break;
      }
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
    arr=bubbleSort(arr);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
}
