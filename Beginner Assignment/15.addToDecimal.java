/*input1: 
247.560
1

output1:
248.56

input2:
45.678
3

output2:
48.678

*/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    float a=sc.nextFloat();
    int b=sc.nextInt();
    System.out.print(a+(float)(b));
    sc.close();
  }
}
