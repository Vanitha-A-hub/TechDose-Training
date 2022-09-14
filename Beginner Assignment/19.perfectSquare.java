import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int root=(int)Math.sqrt(n);
    if(root * root == n){
      System.out.println("Perfect Square");
    }else{
      System.out.println("Not Perfect Square");
    }
    sc.close();
  }
}