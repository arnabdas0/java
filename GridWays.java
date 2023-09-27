public class GridWays{
    public static void printSol(int sol[][]){
        for (int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int x , int y){
        return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }
    
    public static boolean solveMazeUtil(int maze[][] , int x , int y , int sol[][]){
        //base case 
        if (x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        //recursion
        if (isSafe(maze, x, y)==true){
            if(sol[x][y]==1){
                return false;
            }
            sol[x][y]=1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static boolean solveMaze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int [n][n];
        if (solveMazeUtil(maze, 0, 0, sol)==false){
            System.out.println("Solution doesn't exists.");
            return false;
        }
        printSol(sol);
        return true;
    }
    public static void main(String[] args) {
        int maze[][]={{ 1, 0, 0, 0 },
                      { 1, 1, 0, 1 },
                      { 0, 1, 0, 0 },
                      { 1, 1, 1, 1 }};
        solveMaze(maze);
    }
}
