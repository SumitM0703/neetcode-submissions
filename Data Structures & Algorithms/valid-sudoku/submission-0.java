class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box  = new HashSet[9];

        // initialising it :
        for(int i = 0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int r = 0 ; r < board.length;r++){
            for(int c = 0 ; c < board[0].length;c++){
                char num = board[r][c];

                if(board[r][c]=='.'){
                    continue;
                }
                int boxIndex = (r/3)*3+(c/3);
                if(rows[r].contains(num) || 
                   cols[c].contains(num) || 
                   box[boxIndex].contains(num)) {
                    return false;
                }
                 rows[r].add(num);
                cols[c].add(num);
                box[boxIndex].add(num);
            }
        }
        return true;

        
    }
}
