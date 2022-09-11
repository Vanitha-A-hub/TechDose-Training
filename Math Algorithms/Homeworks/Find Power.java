import java.util.Scanner;
class Main {
  public static long findPower(int base,int power){
    long res=1;
    if(power==0){
      return res;
    }
    for(int i=1;i<=power;i++){
      res*=base;
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int power=sc.nextInt();
    System.out.println(findPower(base,power));
    sc.close();
  }
}
