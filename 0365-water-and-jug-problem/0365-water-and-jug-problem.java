class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y < target) return false ; 
        if(x == 0 || y == 0){
            return target == 0 || target == x+y ; 
        }
        return target % gcd(x , y) == 0;  
    }

    public int gcd(int x , int y){
        while(y != 0){
            int temp = y ; 
            y = x % y ; 
            x = temp ;  
        }
        return x ; 
    }
}