/*
input: 34 67
output: 67 34*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("a : "+a+" b : "+b);
    a^=b;
    b^=a;
    a^=b;
    System.out.print("a : "+a+" b : "+b);
  }
}
