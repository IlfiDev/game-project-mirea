package com.ilfidev.Classes.Window;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow(){
        super("GameWindow");
        JPanel[] InventorySlots = new JPanel[20];
        GridLayout layout = new GridLayout(1, 2);
        setLayout(layout);
        JPanel jp = new JPanel();
        jp.setBackground(new Color(0x00FF00FF));

        JPanel jp2 = new JPanel(new GridLayout(5,4));
        jp2.setBackground(new Color(0x00000000));
        for(int i = 0 ; i < InventorySlots.length ; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            InventorySlots[i] = new JPanel();
            InventorySlots[i].setBackground(new Color(r, g, b));
            jp2.add(InventorySlots[i]);
        }
        add(jp2);
        add(jp);

        /*jp2.setLayout(new GridLayout(5,4));
        for(int i = 0 ; i < InventorySlots.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            InventorySlots[i] = new JPanel();
            InventorySlots[i].setBackground(new Color(r,g,b));
            jp2.add(InventorySlots[i]);
        }*/
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
    }
}
