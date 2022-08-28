/*
input: 12 (1100)
output: 3 [In 2nd index(3rd position) rightmost 1 is present]
*/
import java.util.Scanner;
class Main {
  public static int rightMostOne(int n){
    int pos=0;
    while((n&1)==0){
      pos++;
      n=n>>1;
    }
    return pos+1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print("The right most one is in the position "+rightMostOne(n));
  }
}
