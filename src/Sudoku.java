import java.util.HashSet;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
    final int NUM_OF_GAME_POSITIONS = 9;

        HashSet<Character> [] rows = new HashSet[NUM_OF_GAME_POSITIONS];
        HashSet<Character> [] colums = new HashSet[NUM_OF_GAME_POSITIONS];
        HashSet<Character> [] boxes = new HashSet[NUM_OF_GAME_POSITIONS];

        for(int i =0; i < NUM_OF_GAME_POSITIONS; i++){
            rows[i] = new HashSet<Character>();
            colums[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i =0; i < NUM_OF_GAME_POSITIONS; i++){
            for(int j =0; j < NUM_OF_GAME_POSITIONS; j++){
                char currentPositionValue = board[i][j];

                if(currentPositionValue == '.') continue;

                if(rows[i].contains(currentPositionValue)) return false;

                rows[i].add(currentPositionValue);

                if(colums[j].contains(currentPositionValue)) return false;

                colums[j].add(currentPositionValue);

                int boxIndex = (i/3)*3+(j/3);
                if(boxes[boxIndex].contains(currentPositionValue))return false;

                boxes[boxIndex].add(currentPositionValue);
            }
        }
        return true;
    }
}
