package zad6_TicTacToe;

import java.util.Scanner;

class GameTicTacToe extends Board {

    private char currentPlayer;
    private boolean win = false;

    private Scanner scanner = new Scanner(System.in);

    void play() {
        chooseYourMark();
        do {
            printBoard();
            readMove();
        } while (!isWin());
        printBoard();
        System.out.println("game over, the winner is: " + currentPlayer);
    }

    private void readMove() {
        int index;

        System.out.println("Player " + currentPlayer + " move");
        index = scanner.nextInt();
        if (isPlaceTaken(index)) {
            System.out.println("Place taken, choose again");
            printBoard();
            readMove();
        } else {
            choosePlaceOnBoard(index);
            if (currentPlayer == 'o') {
                hasWon(currentPlayer);
                if (isWin()) {
                    return;
                }
                currentPlayer = 'x';
            } else {
                hasWon(currentPlayer);
                if (isWin()) {
                    return;
                }
                currentPlayer = 'o';
            }
        }
    }

    private boolean checkHorizontakLine(int line) {
        int count = 0;
        for (int i = 0; i < getGameBoard().length; i++) {
            if (getGameBoard()[line][i] == currentPlayer) {
                count++;
            }
        }
        return count == 3;
    }

    private boolean checkVerticalkLine(int line) {
        int count = 0;
        for (int i = 0; i < getGameBoard().length; i++) {
            if (getGameBoard()[i][line] == currentPlayer) {
                count++;
            }
        }
        return count == 3;
    }

    private boolean checkCrossLine1() {
        int count = 0;
        for (int i = 0; i < getGameBoard().length; i++) {
            if (getGameBoard()[i][i] == currentPlayer) {
                count++;
            }
        }
        return count == 3;
    }

    private boolean checkCrossLine2() {
        int count = 0;
        for (int i = 2, j = 0; i >= 0 && j < getGameBoard().length; i--, j++) {
            if (getGameBoard()[i][j] == currentPlayer) {
                count++;
            }
        }
        return count == 3;
    }

    private void hasWon(char currentPlayer) {

        win = win || checkHorizontakLine(0);
        win = win || checkHorizontakLine(1);
        win = win || checkHorizontakLine(2);
        win = win || checkVerticalkLine(0);
        win = win || checkVerticalkLine(1);
        win = win || checkVerticalkLine(2);
        win = win || checkCrossLine1();
        win = win || checkCrossLine2();
    }

    private void chooseYourMark() {
        String playerChoice;

        System.out.println("Choose your mark: 'x' , 'o'");
        playerChoice = scanner.next();
        if (playerChoice.equals("x") || playerChoice.equals("o")) {
            this.currentPlayer = playerChoice.charAt(0);
        } else {
            System.out.println("wrong mark, choose again.");
            chooseYourMark();
        }
    }

    private boolean isWin() {
        return win;
    }

    private void choosePlaceOnBoard(int index) {
        char[][] tempChar = getGameBoard();

        if (getBoardPlace(index) == 'x' || getBoardPlace(index) == 'o') {
            System.out.println("this place is taken");

        } else {
            switch (index) {
                case 1:
                    tempChar[0][0] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 2:
                    tempChar[0][1] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 3:
                    tempChar[0][2] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 4:
                    tempChar[1][0] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 5:
                    tempChar[1][1] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 6:
                    tempChar[1][2] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 7:
                    tempChar[2][0] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 8:
                    tempChar[2][1] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
                case 9:
                    tempChar[2][2] = currentPlayer;
                    setGameBoard(tempChar);
                    break;
            }
        }
    }
}

