/*
input: 5
output:
1
12
123
1234
12345

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
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
    System.out.println();
    for(int i=n;i>0;i--){
      for(int j=i;j>0;j--){
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
  }
}
