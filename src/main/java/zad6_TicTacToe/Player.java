package zad6_TicTacToe;

/*
Zadanie 6. Zaimplementuj grę w kółko i krzyżyk na planszy 3x3 użyj
tablic dwuwymiarowych. Pozwól użytkownikowi wybrać czy gra
kółkiem czy krzyżykiem, dla uproszczenia wybór pola dokonaj
poprzez pobranie pojedynczej liczby, tak jak pokazane na obrazku
niżej. Po każdym wyborze wyświetl zaktualizowaną planszę gry.
 */
public class Player extends GameTicTacToe{

    public static void main(String[] args) {

        GameTicTacToe ticTacToe = new GameTicTacToe();
        ticTacToe.play();

    }
}
