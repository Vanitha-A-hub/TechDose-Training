import java.util.Scanner;
class Main {
  public static double circleArea(int r){
    return Math.PI * r * r;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    System.out.println(circleArea(r));
    sc.close();
  }
}
