/*
input:
16 (right)
19 (left)

output:
16 (1 0 0 0 0)

Explanation:

16 - (1 0 0) 0 0
17 - (1 0 0) 0 1
18 - (1 0 0) 1 0
19 - (1 0 0) 1 1

1) Here from 16 to 19, we have common bits 100 . It will not be changed while we perform & operation as 1&1 = 1 and 0&0 = 0. 

2) The uncommon bits between the left and right will be 0 as even one '0' bit in the column will make the & operation result in 0.

*/
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ctr=0;
        while(left!=right){ // shifts until left and right becomes same (here 1 0 0 for 16 and 19)
            left=left>>1;
            right=right>>1;
            ctr++; //counting the number of bits that make the left and right uncommon 
        }
        return left<<ctr; //adding 0's to the number of uncommon bits
    }
}
