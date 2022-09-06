import java.util.Scanner;
class Main {
  public static boolean isPrime(int num){
    for(int i=2;i<num;i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(isPrime(num));
    sc.close();
  }
}
