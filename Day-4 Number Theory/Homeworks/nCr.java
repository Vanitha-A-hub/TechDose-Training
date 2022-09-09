/*
input:
5 3

output:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
10
*/

//nCr= (n-1)Cr+(n-1)C(r-1)
// n will always be smaller than r

import java.util.Scanner;
class Main {
  public static int[][] getCombinationTable(int n){
    int[][] combTable=new int[n+1][n+1];
    for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        if(j==0||j==i){
          combTable[i][j]=1;
        }else{
          combTable[i][j]=combTable[i-1][j]+combTable[i-1][j-1];
        }
      }
    }
    return combTable;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int table[][]=getCombinationTable(n);
    for(int i=0;i<=n;i++){
      for(int j=0;j<=i;j++){
        System.out.print(table[i][j]+" ");
      }
      System.out.println();
    }
    System.out.print(n+"C"+r+" = "+table[n][r]);
    sc.close();
  }   
}
