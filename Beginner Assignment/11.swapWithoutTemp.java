import java.util.Scanner;
class Main {
  public static int[] swap(int a,int b){
    int res[]=new int[2];
    a^=b;
    b^=a;
    a^=b;
    res[0]=a;
    res[1]=b;
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int[] res=swap(a,b);
    System.out.print(res[0]+" "+res[1]);
    sc.close();
  }
}
