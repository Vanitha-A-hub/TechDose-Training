import java.util.Scanner;
class Main {
  public static int sumOfNaturalNumber(int n){
    return (n*(n+1))/2;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(sumOfNaturalNumber(n));
    sc.close();
  }
}
