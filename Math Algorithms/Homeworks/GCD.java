import java.util.Scanner;
class Main {
  public static int gcd(int a,int b){
    return a==0? b: gcd(b%a,a);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.print(gcd(a,b));
    sc.close();
  }
}
