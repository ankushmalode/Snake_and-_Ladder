package com.bridgelabz;
public class game {
    public static void main(String[] args) {
        int snake=1, ladder=2, player=0, count=0;
        int player1=0, player2=0;
        while (player1<100 && player2<100) {

            int dice=(int)(Math.random()*6+1);
            int check=(int)(Math.random()*3+1);

            if (check==ladder) {
                player= player+dice;
                if (player>100)
                    player=player-dice;
            }
            else if (check==snake) {
                player=player-dice;
                if (player<0)
                    player=0;
                else if (player>100)
                    player=player-dice;
            }
            if (count%2==0) {
                player1 = player;
                System.out.println("Player1 current position is: " +player1);
            }
            else {
                player2 = player;
                System.out.println("Player2 current position is: "+player2);
            }
            count++;
//          System.out.println("Player current position is: "+player);
        }
        System.out.println("\n"+count+" times the dice was played.\n");
//        System.out.println(player1+" position");
//        System.out.println(player2+" position.");

        if (player1>player2)
            System.out.println("The winner of this game is Player1");
        else
            System.out.println("The winner of this game is Player2");
    }
}
