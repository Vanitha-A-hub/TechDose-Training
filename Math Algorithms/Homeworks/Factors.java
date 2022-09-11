/*input:
8

output:
[1,2,4,8]
*/

import java.util.*;
class Main {
  public static List<Integer> getFactors(int num){
    List<Integer> l=new ArrayList<Integer>();
    for(int i=1;i<=num;i++){
      if(num%i==0){
        l.add(i);
      }
    }
    return l;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.print(getFactors(num));
    sc.close();
  }
}
