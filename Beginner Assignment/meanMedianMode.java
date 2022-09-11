/*Output
6
1 2 3 4 5 1
  Mean : 2.6666667
  Median : 2.5
  Mode : 1
*/
import java.util.*;
class Main {
  public static float mean(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return (float)sum/arr.length;
  }

  public static float median(int[] arr){
    Arrays.sort(arr);
    if(arr.length%2==0){
      return (arr[arr.length/2] + arr[(arr.length/2)-1])/(float)2;
    }
    else{
      return arr[arr.length/2];
    }
  }

  public static int mode(int[] arr){
    int freq[]=new int[100000];
    int maxFreq=-1,mode=-1;
    for(int i=0;i<arr.length;i++){
      freq[arr[i]]++;
      if(freq[arr[i]]>maxFreq){
        maxFreq=freq[arr[i]];
        mode=arr[i];
      }
    }
    return mode;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Mean : "+mean(arr));
    System.out.println("Median : "+median(arr));
    System.out.print("Mode : "+mode(arr));
    sc.close();
  }
}
