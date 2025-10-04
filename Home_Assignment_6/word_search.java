package Home_Assignment_6;

public class word_search {
    public static void main(String[] args) {
      char [][]  board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
      String word = "ABCCED";
      System.out.println(Solve(board, word));
    }
    public static boolean Solve(char[][] board,String word){
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0)){
                boolean ans=Find(board,word,i,j,0);
                if(ans) return true;
            }

        }
      }
      return false;
    }
    public static boolean Find(char[][]board, String word, int cr, int cc,int idx){
        if(idx==word.length()){
            return true;
        }
        if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length || board[cr][cc]!=word.charAt(idx)){
            return false;
        }
        board[cr][cc]='*';
        if(Find(board,word,cr+1,cc,idx+1)) return true;
        if(Find(board, word, cr-1, cc, idx+1)) return true;
        if(Find(board, word, cr, cc+1, idx+1)) return true;
        if(Find(board, word, cr, cc-1, idx+1)) return true;
        board[cr][cc]=word.charAt(idx);
        return false;
    }
}
