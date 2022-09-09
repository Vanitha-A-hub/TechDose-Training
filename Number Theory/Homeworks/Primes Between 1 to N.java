import java.util.*;
class Main {
  public static List<Integer> getAllPrimeNumbers(int n){
    List<Integer> primes=new ArrayList<Integer>();
    boolean isPrime[]=new boolean[n+1];
    Arrays.fill(isPrime,true);
    for(int i=2;i*i<=n;i++){
      if(isPrime[i]){
        for(int j=i*i;j<=n;j+=i){
          isPrime[j]=false;
        }
      }
    }
    for(int i=1;i<=n;i++){
      if(isPrime[i]){
        primes.add(i);
      }
    }
    return primes;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i:getAllPrimeNumbers(n)){
      System.out.print(i+ " ");
    }
    sc.close();
  }
}
