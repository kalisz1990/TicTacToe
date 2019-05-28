package zad6_TicTacToe;

class Board {

    private char[][] gameBoard = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    void setGameBoard(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    char[][] getGameBoard() {
        return gameBoard;
    }

    char getBoardPlace(int index) {
        int a = 0;
        int b = 0;

        switch (index) {
            case 1:
                a = 0;
                b = 0;
                break;
            case 2:
                a = 0;
                b = 1;
                break;
            case 3:
                a = 0;
                b = 2;
                break;
            case 4:
                a = 1;
                b = 0;
                break;
            case 5:
                a = 1;
                b = 1;
                break;
            case 6:
                a = 1;
                b = 2;
                break;
            case 7:
                a = 2;
                b = 0;
                break;
            case 8:
                a = 2;
                b = 1;
                break;
            case 9:
                a = 2;
                b = 2;
                break;
        }
        return getGameBoard()[a][b];
    }

    void printBoard() {
        System.out.print(" _ _  _ _  _ _\n");
        for (char[] aGameBoard : this.gameBoard) {
            for (char anAGameBoard : aGameBoard) {
                System.out.print("|_" + anAGameBoard + "_|");
            }
            System.out.println();
        }
    }


}
