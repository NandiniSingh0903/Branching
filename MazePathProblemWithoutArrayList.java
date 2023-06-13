public class MazePathProblemWithoutArrayList {
    static void getMazePos(int currentRow, int currentCol, int endRow, int endCol, String result){
        if(currentCol==endCol && currentRow==endRow){
            System.out.print(result+"  ");
        }

        if(currentCol>endCol || currentRow>endRow){
            return;
        }

        //right move
        getMazePos(currentRow, currentCol+1, endRow, endCol, result+"R");

        //left move
        getMazePos(currentRow+1, currentCol, endRow, endCol, result+"D");
    }

    public static void main(String[] args) {
        getMazePos(0,0,2,2," ");
    }
}
