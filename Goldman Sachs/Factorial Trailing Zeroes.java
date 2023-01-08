// Question: leetcode.com/problems/factorial-trailing-zeroes/

class Solution {
    public int trailingZeroes(int n) {
        if(n < 5) return 0;
        
        int count5 = 0;
        
        for(int i = 5; i <= n; i+=5){
            int time = 0;
            int num = i;
            while(num%5 == 0){
                time++;
                num/=5;
            }
            count5 += time;
        }        
        
        return count5;
    }
}

TC - O(logn)
SC - O(1)
