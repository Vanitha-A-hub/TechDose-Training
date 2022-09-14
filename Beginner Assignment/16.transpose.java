/*
input:
2 3
1 2 3
4 5 6

output:
1 4
2 5
3 6
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int j=0;j<c;j++){
      for(int i=0;i<r;i++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}