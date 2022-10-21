class Main{
 
   public long multiplyTwoLists(Node l1,Node l2){
        
          Stack<Integer> s1 = new Stack<>();
          Stack<Integer> s2 = new Stack<>();
          
          long m1 = 0;
          while(l1 != null)
          {
              m1 = ((m1*10)+l1.data)%1000000007;
              l1 = l1.next;
          }
          long m2 = 0;
          while(l2 != null)
          {
              m2 = ((m2*10)+l2.data)%1000000007;
              l2 = l2.next;
          }

          long res = (m1*m2)%1000000007;
          return res;
   }
}
