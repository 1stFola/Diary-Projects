package TictacToeProject;

import java.util.*;


        public class TicTacToe {

            private static ArrayList<Integer> player1Spot = new ArrayList<Integer>();
            private static ArrayList<Integer> player2Spot = new ArrayList<Integer>();
            static String[][] gameBoard = {{" ", "|", " ", "|", " "},
                        {"-", "+", "-", "+", "-"},
                        {" ", "|", " ", "|", " "},
                        {"-", "+", "-", "+", "-"},
                        {" ", "|", " ", "|", " "}};

            public static void main(String[] args) {


                Scanner select = new Scanner(System.in);

                while (true) {

                    System.out.println("Player 1 - please enter a number from 1 - 9 to select a position on the board");
                    int play1 = select.nextInt();
                    while (player1Spot.contains(play1) || player2Spot.contains(player1Spot)){
                        System.out.print("Position taken! please enter a new number: ");
                        play1 = select.nextInt();
                    }
                    placePiece(gameBoard, play1, "player1");
                    printGameboard(gameBoard);

                    String winner = checkWinner();
                    if (winner.length() > 0){
                        System.out.println(winner);
                    break;}

                    System.out.println("Player 2 - please enter a number from 1 - 9 to select a position on the board");
                    int play2 = select.nextInt();
                    while (player1Spot.contains(play2) || player2Spot.contains(play2)){
                        System.out.print("Position taken! please enter a new number: ");
                        play2 = select.nextInt();
                    }
                    placePiece(gameBoard, play2, "player2");
                    printGameboard(gameBoard);

                    winner = checkWinner();
                    if (winner.length() > 0){
                        System.out.println(winner);
                    break;}
                }

            }

            private static String checkWinner(){
                List leftCol = List.of(1, 4, 7);
                List midCol = List.of(2, 5, 8);
                List rightCol = List.of(3, 6, 9);
                List topRow = List.of(1, 2, 3);
                List midRow = List.of(4, 5, 6);
                List bottomRow = List.of(7, 8, 9);
                List crossA = List.of(1, 5, 9);
                List crossB = List.of(3, 5, 7);

                List<List> winCheck = new ArrayList<>();
                winCheck.add(leftCol);
                winCheck.add(midCol);
                winCheck.add(rightCol);
                winCheck.add(topRow);
                winCheck.add(bottomRow);
                winCheck.add(midRow);
                winCheck.add(crossA);
                winCheck.add(crossB);

                for (List list : winCheck) {
                    if (player1Spot.containsAll(list)){
                        return "Player 1 has won the game!";
                    }else if(player2Spot.containsAll(list)){
                        return "Player 2 has won the game!";
                    }else if (player1Spot.size() + player2Spot.size() == 9){
                       return "We have a game tie! Let's quit the game and try again!";
                    }
                }
                return "";
            }

            private static void placePiece(String[][] gameBoard, int play, String player) {
                TicTacToeEnum symbol = TicTacToeEnum.EMPTY;

                    if (player.equals("player1")) {
                        symbol = TicTacToeEnum.X;
                        player1Spot.add(play);
                    }
                    if (player.equals("player2")) {
                        symbol = TicTacToeEnum.O;
                        player2Spot.add(play);
                    }

                switch (play) {
                    case 1:
                        gameBoard[0][0] = String.valueOf(symbol);
                        break;
                    case 2:
                        gameBoard[0][2] = String.valueOf(symbol);
                        break;
                    case 3:
                        gameBoard[0][4] = String.valueOf(symbol);
                        break;
                    case 4:
                        gameBoard[2][0] = String.valueOf(symbol);
                        break;
                    case 5:
                        gameBoard[2][2] = String.valueOf(symbol);
                        break;
                    case 6:
                        gameBoard[2][4] = String.valueOf(symbol);
                        break;
                    case 7:
                        gameBoard[4][0] = String.valueOf(symbol);
                        break;
                    case 8:
                        gameBoard[4][2] = String.valueOf(symbol);
                        break;
                    case 9:
                        gameBoard[4][4] = String.valueOf(symbol);
                    default:
                }
            }


            private static void printGameboard(String[][] gameBoard) {
                for (String[] row : gameBoard) {
                    for (String c : row){
                        System.out.print(c);
                    }
                    System.out.println();
                }
            }



        }

