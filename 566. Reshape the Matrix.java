class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int row=mat.length;
        int column=mat[0].length;
        
        if((row * column)!=(r * c))
            return mat;
        
        int[][] result = new int[r][c];
           int row_count=0;
           int column_count=0;
           
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[row_count][column_count]=mat[i][j];
                column_count++;
                
                if(column_count==c){
                    column_count=0;
                    row_count++;
                }
                    
            }
        }  
           return result;
        
    }
}
