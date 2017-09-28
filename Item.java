package com.mcfunkyjello.main.gameplay;

public abstract class Item {
    private int rarity;

    public Item() {
        rarity = (int)(Math.random()*5+1); //1 TO 5
    }
}
