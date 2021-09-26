package com.bridgelabz;

public class game {
    public static void main(String[] args) {
        int snake=1, ladder=2, player=0;
        int dice=(int)(Math.random()*6+1);
        System.out.println(dice);

        int check=(int)(Math.random()*3+1);
        if (check==snake) {
            player= player+dice;
        }
        else if (check==ladder) {
            player=player-dice;
        }
        else {
            player=player+dice;
        }
        System.out.println("Player position is: "+player);
    }
}
