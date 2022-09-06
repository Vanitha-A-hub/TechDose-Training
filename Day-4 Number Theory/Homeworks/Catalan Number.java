/*Catalan Number : https://youtu.be/CMaZ69P1bAc

I have used Boolean coefficient method(formula)

inputs: 0 1 2 3 4
ouputs: 1 1 2 5 14 
*/

import java.util.Scanner;
class Main {
  public static int factorial(int n){
    if(n==0){
      return 1;
    }else{
      return n*factorial(n-1);
    }
  }
  public static int catalanNumber(int n){    
    int ans=factorial(2*n)/(factorial(n) * factorial(n+1));
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(catalanNumber(n));
    sc.close();
  }
}
