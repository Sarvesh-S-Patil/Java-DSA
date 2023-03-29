import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        char[][] game = new char[3][3];
        for(int i =0;i<game.length;i++){
            for(int j =0;j<game[0].length;j++){
                game[i][j]=' ';
            }
        }

        char player = 'X';
        boolean game_over = false;
        while (!game_over){
            print_game(game);
            System.out.println("Enter your move co-ords : ");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int column = sc.nextInt();
            if (game[row][column] == ' ') {
                game[row][column]= player;
                if(player == 'X'){
                    player ='O';
                }
                else{
                    player = 'X';
                }

            }
            else{
                System.out.println("The box is occupied ,Try Again.");
            }
            game_over = is_game_over(game);

        }

    }

    private static void print_game(char[][] game) {
        for(int i =0;i<game.length;i++){
            for(int j =0;j<game[0].length;j++){
                System.out.print(game[i][j]+" "+'|');
            }
            System.out.println();
        }
    }

    private static boolean is_game_over(char[][] game) {
        boolean game_over = false;
        char player = ' ';
        for(int i =0;i<game[0].length;i++){

            if(game[i][0] == game[i][1] && game[i][1]== game[i][2] &&  (game[i][0] == 'X' || game[i][0] == 'O') ){
                player =game[i][0];
                game_over = true;
            }

            if(game[0][i] == game[1][i]  && game[1][i]== game[2][i] &&  (game[0][i] == 'X' || game[0][i] == 'O')){
                player = game[0][i];
                game_over = true;
            }
        }

        if(game[0][0] ==game[1][1] && game[1][1]== game[2][2] &&  (game[0][0] == 'X' || game[0][0] == 'O')){
            player = game[0][0];
            game_over = true;
        }
        if(game[0][2] ==game[1][1] && game[1][1]== game[2][0] &&  (game[1][1] == 'X' || game[1][1] == 'O')){
            player = game[0][2];
            game_over = true;
        }
        if(game_over == true){
            if(player=='X'){
                System.out.println("Player 1 has won the game !");
            }
            else{
                System.out.println("Player 2 has won the game!");
            }

        }
        return game_over;
    }



}