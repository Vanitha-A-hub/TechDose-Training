/*input:
12

output:
-13
3
-12
*/

import java.util.Scanner;
class Main {
  public static int onesCompliment(int n){
    return ~n;
  }
  public static int onesComplimentMSB(int n){
    for(int i=0;(n>>i)!=0;i++){
      n=n^(1<<i);
    }
    return n;
  }
  public static int twosCompliment(int n){
    return (~n)+1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("1's Compliment : "+onesCompliment(n));
    System.out.println("1's Compliment MSB : "+onesComplimentMSB(n));
    System.out.print("2's Compilement : "+twosCompliment(n));
    sc.close();
  }
}
