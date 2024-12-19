class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;
        fill(image, sr, sc, image[sr][sc], color);
        return image;

    }

    public void fill(int[][] image, int sr, int sc , int oldColor , int color){

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor){
            return;
        }

        image[sr][sc] = color;

        fill(image, sr-1, sc, oldColor, color);
        fill(image, sr+1, sc, oldColor, color);
        fill(image, sr, sc-1, oldColor, color);
        fill(image, sr, sc+1, oldColor, color);


    }
}


// T(C): O(sr.sc) , height of recursion stack (DFS)
// S(C): O(1)
