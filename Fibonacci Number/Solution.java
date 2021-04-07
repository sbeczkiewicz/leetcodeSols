class Solution {
    
    
    public int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        if (n == 0) {
            return num1;
        }
        else if (n == 1) {
            return num2;
        }
        else {
            for (int i = 1; i < n; i++) {
                int num3 = num1 + num2;
                int temp = num2;
                num2 = num3;
                num1 = temp;
            }
            return num2;
        }
        
        
    }
}
