package zad6_TicTacToe;

import java.util.Scanner;

class GameTicTacToe {

    private char player1Mark;
    private char player2Mark;
    private char winner;
    private boolean win = false;
    private char[][] gameBoard = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    private Scanner scanner = new Scanner(System.in);

    void play() {
        chooseYourMark();
        do {
            player1Move();
            if (isWin()) {
                this.winner = this.player1Mark;
                break;
            }
            player2Move();
            if (isWin()) {
                this.winner = this.player2Mark;
                break;
            }

        } while (!this.win);
        createBoard();
        System.out.println("game over, the winner is: " + this.winner);
    }

    private boolean isWin() {
        return win;
    }

    private void createBoard() {
        System.out.print(" _ _  _ _  _ _\n");
        for (char[] aGameBoard : this.gameBoard) {
            for (char anAGameBoard : aGameBoard) {
                System.out.print("|_" + anAGameBoard + "_|");
            }
            System.out.println();
        }
    }

    private void chooseYourMark() {
        String playerChoice;
        do {
            System.out.println("Choose your mark: 'x' , 'o'");
            playerChoice = scanner.next();
            if (playerChoice.equals("x") || playerChoice.equals("o")) {
                this.player1Mark = playerChoice.charAt(0);
            } else {
                System.out.println("wrong mark, choose again.");
            }
        } while (!playerChoice.equals("x") && !playerChoice.equals("o"));

        if (this.player1Mark == 'x') {
            this.player2Mark = 'o';
        } else {
            this.player2Mark = 'x';
        }
    }

    private void conditionOfWinPlayer1() {
        if ((gameBoard[0][0] == player1Mark && gameBoard[0][1] == player1Mark) && gameBoard[0][2] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[1][0] == player1Mark && gameBoard[1][1] == player1Mark) && gameBoard[1][2] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[2][0] == player1Mark && gameBoard[2][1] == player1Mark) && gameBoard[2][2] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[0][0] == player1Mark && gameBoard[1][0] == player1Mark) && gameBoard[2][0] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[0][1] == player1Mark && gameBoard[1][1] == player1Mark) && gameBoard[2][1] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[0][2] == player1Mark && gameBoard[1][2] == player1Mark) && gameBoard[2][2] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[0][0] == player1Mark && gameBoard[1][1] == player1Mark) && gameBoard[2][2] == player1Mark) {
            this.win = true;
        }
        if ((gameBoard[2][2] == player1Mark && gameBoard[1][1] == player1Mark) && gameBoard[0][2] == player1Mark) {
            this.win = true;
        }
    }

    private void conditionOfWinPlayer2() {
        if ((gameBoard[0][0] == player2Mark && gameBoard[0][1] == player2Mark) && gameBoard[0][2] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[1][0] == player2Mark && gameBoard[1][1] == player2Mark) && gameBoard[1][2] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[2][0] == player2Mark && gameBoard[2][1] == player2Mark) && gameBoard[2][2] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[0][0] == player2Mark && gameBoard[1][0] == player2Mark) && gameBoard[2][0] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[0][1] == player2Mark && gameBoard[1][1] == player2Mark) && gameBoard[2][1] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[0][2] == player2Mark && gameBoard[1][2] == player2Mark) && gameBoard[2][2] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[0][0] == player2Mark && gameBoard[1][1] == player2Mark) && gameBoard[2][2] == player2Mark) {
            this.win = true;
        }
        if ((gameBoard[2][2] == player2Mark && gameBoard[1][1] == player2Mark) && gameBoard[0][2] == player2Mark) {
            this.win = true;
        }
    }

    private void player1Move() {
        createBoard();
        System.out.println("Player " + player1Mark + " move");
        choosePlaceOnBoardPlayer1(scanner.nextInt());
        conditionOfWinPlayer1();
    }

    private void player2Move() {
        createBoard();
        System.out.println("Player " + player2Mark + " move");
        choosePlaceOnBoardPlayer2(scanner.nextInt());
        conditionOfWinPlayer2();
    }

    private void choosePlaceOnBoardPlayer1(int placeOnBoard) {
        switch (placeOnBoard) {
            case 1:
                if ((this.gameBoard[0][0] != this.player2Mark) && (this.gameBoard[0][0] != this.player1Mark)) {
                    this.gameBoard[0][0] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 2:
                if ((this.gameBoard[0][1] != this.player2Mark) && (this.gameBoard[0][1] != this.player1Mark)) {
                    this.gameBoard[0][1] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 3:
                if ((this.gameBoard[0][2] != this.player2Mark) && (this.gameBoard[0][2] != this.player1Mark)) {
                    this.gameBoard[0][2] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 4:
                if ((this.gameBoard[1][0] != this.player2Mark) && (this.gameBoard[1][0] != this.player1Mark)) {
                    this.gameBoard[1][0] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 5:
                if ((this.gameBoard[1][1] != this.player2Mark) && (this.gameBoard[1][1] != this.player1Mark)) {
                    this.gameBoard[1][1] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 6:
                if ((this.gameBoard[1][2] != this.player2Mark) && (this.gameBoard[1][2] != this.player1Mark)) {
                    this.gameBoard[1][2] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                    break;
                }
            case 7:
                if ((this.gameBoard[2][0] != this.player2Mark) && (this.gameBoard[2][0] != this.player1Mark)) {
                    this.gameBoard[2][0] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 8:
                if ((this.gameBoard[2][1] != this.player2Mark) && (this.gameBoard[2][1] != this.player1Mark)) {
                    this.gameBoard[2][1] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
            case 9:
                if ((this.gameBoard[2][2] != this.player2Mark) && (this.gameBoard[2][2] != this.player1Mark)) {
                    this.gameBoard[2][2] = this.player1Mark;
                } else {
                    System.out.println("this place is taken");
                    player1Move();
                }
                break;
        }
    }

    private void choosePlaceOnBoardPlayer2(int placeOnBoard) {
        switch (placeOnBoard) {
            case 1:
                if ((this.gameBoard[0][0] != this.player1Mark) && (this.gameBoard[0][0] != this.player2Mark)) {
                    this.gameBoard[0][0] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 2:
                if ((this.gameBoard[0][1] != this.player1Mark) && (this.gameBoard[0][1] != this.player2Mark)) {
                    this.gameBoard[0][1] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 3:
                if ((this.gameBoard[0][2] != this.player1Mark) && (this.gameBoard[0][2] != this.player2Mark)) {
                    this.gameBoard[0][2] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 4:
                if ((this.gameBoard[1][0] != this.player1Mark) && (this.gameBoard[1][0] != this.player2Mark)) {
                    this.gameBoard[1][0] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 5:
                if ((this.gameBoard[1][1] != this.player1Mark) && (this.gameBoard[1][1] != this.player2Mark)) {
                    this.gameBoard[1][1] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 6:
                if ((this.gameBoard[1][2] != this.player1Mark) && (this.gameBoard[1][2] != this.player2Mark)) {
                    this.gameBoard[1][2] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 7:
                if ((this.gameBoard[2][0] != this.player1Mark) && (this.gameBoard[2][0] != this.player2Mark)) {
                    this.gameBoard[2][0] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 8:
                if ((this.gameBoard[2][1] != this.player1Mark) && (this.gameBoard[2][1] != this.player2Mark)) {
                    this.gameBoard[2][1] = this.player2Mark;
                } else {
                    System.out.println("this place is taken");
                    player2Move();
                }
                break;
            case 9:
                if ((this.gameBoard[2][2] != this.player1Mark) && (this.gameBoard[2][2] != this.player2Mark)) {
                    this.gameBoard[2][2] = this.player2Mark;
                } else {
                    System.out.println("this place is taken by other player");
                    player2Move();
                }
                break;
        }
    }
}
