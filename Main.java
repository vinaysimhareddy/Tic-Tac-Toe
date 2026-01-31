import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row =0; row<board.length; row++){
            for(int col =0; col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='x';
        boolean gameOver = false;
        try (Scanner in = new Scanner(System.in)) {
            while(!gameOver){
                printboard(board);
                System.out.print("Player "+player+" Enter: ");
                int row = in.nextInt();
                int col = in.nextInt();
                System.out.println();

                if(board[row][col] == ' '){
                    board[row][col] = player;
                    gameOver = haveWon(board,player);
                    if(gameOver){
                        printboard(board);
                        System.out.println("Player "+player+" has won: ");
                    }else if(isBoardFull(board)){
                        printboard(board);
                        System.out.println("its a draw ");
                        gameOver = true;
                    }else{
                        player = (player == 'x') ? 'o':'x';
                    }
                }else{
                    System.out.println("Invalid move. Try Again");
                    }
                }
        }
    }

    public static boolean isBoardFull(char[][] board) {
        for(int row=0; row<board.length;row++){
            for(int col=0; col<board[row].length;col++){
                if(board[row][col]==' ') return false;
            }
        }
        return true;
    }

    public static boolean haveWon(char[][] board, char player){
            // for row
            for(int row =0; row<board.length; row++){
                if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                    return true;
                }
            }
    
            // for col
            for(int col =0; col<board[0].length; col++){
                if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                    return true;
                }
            }
    
            // for diagonal
            if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
                return true;
            } 
    
            if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
                return true;
            }else{
                return false;
            } 
        }


    public static void  printboard(char[][] board){
            for(int row=0; row<board.length;row++){
                for(int col=0; col<board[row].length;col++){
                    System.out.print(board[row][col]+" | ");
                }
                System.out.println();
            }
        }


}