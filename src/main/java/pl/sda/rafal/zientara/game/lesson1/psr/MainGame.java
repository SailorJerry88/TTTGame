package pl.sda.rafal.zientara.game.lesson1.psr;

import pl.sda.rafal.zientara.game.lesson1.psr.players.Player;
import pl.sda.rafal.zientara.game.lesson1.psr.players.RandomPlayer;

public class MainGame {

    public static void main(String[] args) {
        Player player1 = new RandomPlayer();
        Player player2 = new RandomPlayer();

//        System.out.println("Player1:" + player1.chooseAction());
//        System.out.println("Player2:" + action2);

        Game game = new Game(player1, player2);
        GameResult result = game.checkResult();
        System.out.println(result);
    }
}
