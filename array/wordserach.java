
public class wordserach {

    public  static boolean exist(char[][] board,String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board, i, j, 0,word)){
                    return true;
                    }
                }
            }
        } 
        return false;
    }
    public static boolean dfs(char [][] martix,int row,int col,int index,String word){
        if(index == word.length()){
            return true;
        }
        if(row <0 || col <0|| row >=martix.length|| col>= martix[0].length|| martix[row][col]!=word.charAt(index)){
            return false;
        }
        char temp = martix[row][col];
        martix[row][col]='#';
        
      boolean found = 
        dfs(martix, row+1, col, index+1, word) ||
        dfs(martix, row-1, col, index+1, word) ||
        dfs(martix, row, col+1, index+1, word) ||
        dfs(martix, row, col-1, index+1, word) ;
        
        martix [row][col]=temp;
        return found;
    }
    public static void main(String[] args) {
              char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "DEE";

        System.out.println(exist(board, word));      
    }

}
