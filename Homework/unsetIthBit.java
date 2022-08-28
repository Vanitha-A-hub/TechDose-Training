/*input: 
12 (1100)
3

output:
8 (1000)
*/
import java.util.Scanner;
class Main {
  public static int unsetIthBit(int n,int pos)  {
    return n&(~(1<<(pos-1))) ; 
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=sc.nextInt();
    System.out.print("After unsetting the ith bit in "+pos+" position, we get "+unsetIthBit(n,pos));
  }
}
