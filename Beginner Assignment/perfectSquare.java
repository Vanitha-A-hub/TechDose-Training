import java.util.Scanner;
class Main {
  public static String isPerfectSquare(int n){
    int s=(int)Math.sqrt(n);
    if(s*s==n){
      return "Perfect Square";
    }else{
      return "Not Perfect Square";
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(isPerfectSquare(n));
    sc.close();
  }
}
