package com.ilfidev;

import com.ilfidev.Classes.Game;
import com.ilfidev.Classes.GameWindow;
import com.ilfidev.Classes.Player;

public class Main {

    public static void main(String[] args) {
        new GameWindow();
	Player player = new Player("Igor", 10, 100);
    Game game = new Game(player);
    game.startGame();

    }
}
