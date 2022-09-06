import java.util.*;
class Main {
  public static List<Integer> primeFactors(int n){
    List<Integer> l=new ArrayList<Integer>();
    for(int i=2;i*i<=n;i++){
      while(n%i==0){
        n/=i;
        l.add(i);
      }
    }
    if(n>1){
      l.add(n);
    }
    return l;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> arr=primeFactors(n);
    for(int i:arr){
      System.out.print(i+" ");
    }
    sc.close();
  }
}
