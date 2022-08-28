/*
input:
14 (1110)
1

output
15 (1111)
*/
import java.util.Scanner;
class Main {
  public static int setIthBit(int n,int pos){
    return n|(1<<(pos-1));
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=sc.nextInt();
    System.out.print("After setting the "+pos +" position bit we get "+setIthBit(n,pos));
  }
}
