// IN PROGRESS


// Difficulty: Medium
// Technique used: While loop to loop through 2d array and making a new array for result
// Runtime: O(n^2)


public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0;
        int col = 1;
        int[] arr = new int[mat.length*mat[0].length];
        int index = 0;
        while( index < arr.length  ) {
            if( row < mat.length ) {
                 int j = 0;
                System.out.println( "Main" );
                for( int i = row; i >= 0; i-- ) {
                    arr[index] = mat[i][j];
                    
                    System.out.println( "" + i + " " + j);
                    index++;
                    j++;
                }
                row++;
            }      
            if( col < mat[0].length ) {
                int i = 0;
                System.out.println( "Other" );
                for( int j = col; j >= 0; j-- ) {
                    arr[index] = mat[i][j];
                    
                    System.out.println( "" + i + " " + j);
                    index++;
                    i++;
                }
                col++;
            }
        }
        return arr;
    }
}
