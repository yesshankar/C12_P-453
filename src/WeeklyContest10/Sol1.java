package WeeklyContest10;

/**
 * Created by Shankar on 11/19/2016.
 */
public class Sol1 {
    public static void main(String[] args) {

        int[][] grids = {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};

        System.out.println("Island Perimeter is : " + islandPerimeter(grids));
    }

    public static int islandPerimeter(int[][] grid) {

        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1){
                    counter += emptyAdjacent(grid, i, j);

                }
            }
        }
        
        
        return counter;

    }

    public static int emptyAdjacent(int[][] grid, int row, int column){
        int count = 0;

        if(row == 0 && column == 0){    // top left corner

            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            count+= 2;

        }
        else if(row == grid.length-1 && column == 0){   // bottom left corner

            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            count +=2;

        }
        else if(row == 0 && column == grid[row].length-1){     // top right corner

            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            if(grid[row][column-1] == 0)    // left adjacent
                count++;
            count += 2;
        }
        else if(row == grid.length-1 && column == grid[row].length-1){  // bottom right corner

            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row][column-1] == 0)    // left adjacent
                count++;
            count += 2;
        }
        else if(row == 0){  // top line

            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            if(grid[row][column-1] == 0)    // left adjacent
                count++;
            count++;
        }
        else if(column == 0){   // left line

            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            count++;
        }
        else if(column == grid[row].length-1){  // right line

            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            if(grid[row][column-1] == 0)    // left adjacent
                count++;
            count++;
        }
        else if(row == grid.length-1){     // bottom line

            if(grid[row][column-1] == 0)    // left adjacent
                count++;
            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            count++;
        }
        else{
            if(grid[row-1][column] == 0)    // top adjacent
                count++;
            if(grid[row][column+1] == 0)    // right adjacent
                count++;
            if(grid[row+1][column] == 0)    // bottom adjacent
                count++;
            if(grid[row][column-1] == 0)    // left adjacent
                count++;
        }


        return count;
    }
}
