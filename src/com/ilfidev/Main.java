package com.ilfidev;

import com.ilfidev.Classes.Game;
import com.ilfidev.Classes.Window.GameWindow;
import com.ilfidev.Classes.Player;

public class Main {

    public static void main(String[] args) {
        //new GameWindow();
	    Player player = new Player("Igor", 10, 100, 20);
        Game game = new Game(player);
        game.startGame();

    }
}
