import java.util.Scanner;
class Main {
  public static int[][] pascalTriangle(int n){
    int res[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        if(j==0 || j==i){
          res[i][j]=1;
        }else{
          res[i][j]=res[i-1][j-1]+res[i-1][j];
        }
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=pascalTriangle(n);
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
