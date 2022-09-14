import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int freq[]=new int[10];
    while(n>0){
      if(freq[n%10]==0){
        System.out.print(n%10+" ");
        freq[n%10]=1;
      }
      n/=10;
    }
    sc.close();
  }
}