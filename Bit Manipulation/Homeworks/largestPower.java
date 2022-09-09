/*
input: 1023
output: 512
*/
import java.util.Scanner;
class Main {
  public static int largestPower(int N){
    while((N>0 ) && ((N&(N-1))!=0)){
      N=N &(N-1);
    }
    return N;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("The largest power that is closer and less than or equal to "+n+" is "+largestPower(n));
  }
}
