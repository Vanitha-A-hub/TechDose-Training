// gcd * lcm = a * b ;

/* 
  input: 23 49
  output: 1127 
*/

import java.util.Scanner;
class Main {
  public static int gcd(int a,int b){
    return (a==0)?b: gcd(b%a,a);
  }
  public static int lcm(int a,int b){
    int res=(a*b)/gcd(a,b);
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.print(lcm(a,b));
    sc.close();
  }
}
