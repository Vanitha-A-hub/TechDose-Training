/*
input:
32

output:
true

Explanation:
n   --->  1 0 0 0 0 0
n-1 --->  0 1 1 1 1 1
n & (n-1) ---> 0
*/

import java.util.Scanner;
class Main {
  public static boolean isPowerOf2(int n){
    return ( (n>0) && ((n&(n-1))==0) );
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isPowerOf2(n)){
      System.out.print(n+" is a power of two");
    }else{
      System.out.print(n+" is not a power of two");
    }
  }
}
