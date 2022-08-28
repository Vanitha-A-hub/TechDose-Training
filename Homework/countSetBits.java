/*
input: 7 (0111)
output: 3
*/
import java.util.Scanner;
class Main {
  public static int countSetBits(int n){
    int count=0;
    for(int i=0;(n>>i)!=0;i++){
      if((n&(1<<i)) > 0){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("The number of set bits in "+n+" is "+countSetBits(n));
  }
}
