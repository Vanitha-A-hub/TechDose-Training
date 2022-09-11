/*
input : 5
output:
54321
4321
321
21
1
*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n;i>0;i--){
      for(int j=i;j>0;j--){
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
  }
}