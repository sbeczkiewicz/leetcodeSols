class Solution {
    public int reverse(int x) {
        if (x > 2147483647) {
                return 0;
            }
        
        int orig = x;
        boolean flag = false;
        if (x<0) {
            orig = orig * -1;
            
            flag = true;
            
        } else {
            
        }
        long rev = 0;
        while (orig > 0) {
            long check = rev*10 + orig%10;
            if (check  > 2147483647) {
                return 0;
            }
            rev *= 10;
            
            int remain = orig%10;
            
            rev += remain;
            orig = orig / 10;
        }
        if (flag) {
            return (int)-rev;
        } else {
            return (int)rev;
        }
        
    }
    
}