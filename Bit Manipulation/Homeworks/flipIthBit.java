/*input: 
5 (101)
2

output: 
7 (111)
*/
  import java.util.Scanner;
class Main {
  public static int flipIthBit(int n,int pos)
  {
    return n^(1<<(pos-1));
  }  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=sc.nextInt();
    System.out.print("After flipping the "+pos+" position i-th bit, we get "+flipIthBit(n,pos));
  }
}
