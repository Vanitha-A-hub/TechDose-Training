/*
odd number has 1 as its least significant bit.
even number has 0 as its least significant bit.
For example : 13 --> 110(1)
12 --> 110(0)
We know that 1&1=1 and 0&1=0
*/
import java.util.Scanner;
class Main {
  public static boolean isEven(int n){
    return (n&1)==0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isEven(n)){
      System.out.print(n+" is even");
    }else{
      System.out.print(n+" is odd");
    }
  }
}
