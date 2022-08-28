/*
input1:
14 (1110)
2

input2:
12(1100)
1

output1 : set bit
output2 : not set bit
*/
import java.util.Scanner;
class Main {
  public static boolean isSetBit(int n,int pos){
    return (n & (1<<(pos-1)))!=0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=sc.nextInt();
    if(isSetBit(n,pos)){
      System.out.print("The ith ("+pos+") position of n is set");
    }
    else{
      System.out.print("The ith ("+pos+") position of n is not set"); 
    }
  }
}
