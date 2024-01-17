public class Nqueens {
    public static boolean isSafe(char board[][], int row , int col){
        //vertical up
        for (int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left dia
        for (int i=row-1,j=col-1; i>=0 && j>=0 ; i-- ,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //right dia
        for (int i=row-1,j=col+1; i>=0 && j<board.length ; i-- ,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][], int row){
        //base case 
        if (row == board.length){
            printBoard(board);
            count++;
            return;
            // return true;
        }
        // recursion
        for (int j=0; j<board.length; j++){
            if (isSafe(board, row , j)){
                board[row][j]='Q';
                nQueens(board, row+1);
            //    if (nQueens(board, row+1)){//function calling
            //     return true;
            //    }
                board[row][j]='x';//backtracking step
            }
            
        }
        // return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------------Chess Board-------------");
        for (int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;

    public static void main(String args[]) {
        int n = 4;
        char board [][] =new char [n][n];
        //initialitation
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        nQueens(board, 0);
        // if (nQueens(board, 0)){
        //     System.out.println("Solution is possible.");
        //     printBoard(board);
        // }else{
        //     System.out.println("Solution is not possible.");
        // }
        System.out.println("Total no of ways to solve:"+ count);
    }
    
}
