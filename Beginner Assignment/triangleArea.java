import java.util.Scanner;
class Main {
  public static int triangleArea(int b,int h){
    return (b*h)/2;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int height=sc.nextInt();
    System.out.print(triangleArea(base,height));
    sc.close();
  }
}
