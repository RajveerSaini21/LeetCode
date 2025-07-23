class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc] ; 

        if(originalColor != color){
            dsf(image ,sr , sc , originalColor , color) ; 
        }
        return image ; 
    }


    public static void dsf(int[][] image , int r , int c , int originalColor , int newColor){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor){
            return ; 
        }

        image[r][c] = newColor ; 

        dsf(image , r+1 , c , originalColor , newColor) ;
        dsf(image , r-1 , c , originalColor , newColor) ;
        dsf(image , r , c+1 , originalColor , newColor) ;
        dsf(image , r , c-1 , originalColor , newColor) ;
    }
}