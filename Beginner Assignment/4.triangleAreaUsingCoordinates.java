import java.util.Scanner;
class Main {
  public static int triangleArea(int x1,int y1,int x2,int y2,int x3,int y3){
    int d1=x1 * (y2 - y3);
    int d2=x2 * (y3 - y1);
    int d3=x3 * (y1 - y2);
    return (d1+d2+d3)/2;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x3=sc.nextInt();
    int y3=sc.nextInt();
    System.out.print(triangleArea(x1,y1,x2,y2,x3,y3)+" sq.units");
    sc.close();
  }
}
