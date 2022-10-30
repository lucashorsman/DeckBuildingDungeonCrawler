//Handles Turns, player input and enemy turns

import java.util.Random;
import java.util.Scanner;

public class Room {
    static Player player = new Player();

    public static int FloorNum = 0;

    public static int getFloor() {
        return FloorNum;
    }

    public static int i;

    public static Scanner in = new Scanner(System.in);
    public static int EnemyHP; // store in room.java
    public static int Turn = 0;

    public static int getTurn() {
        return Turn;
    }

    public static void enemyPhase() {

        System.out.println("-------------------------------------------------");
        System.out.println("EnemyTurnHere");
        Floor.tempMob.mobTurn();
        Run.PlayerTurn = true;
        
    }
    
    public static void playerPhase() {
        player.resetENG();
        player.resetBlock();
        // check if draw pile >=3 then move on, else combine draw +discard then shuffle,
        // then draw
        Turn++;
        Floor.tempMob.mobIntent();
        Card.DrawHand();

        while (true) {
            if (EnemyHP <= 0) {
                Run.running = false;
                break;
            }
            System.out.println("what card to play? Your Hand is: " + Card.getHand()
                    + "\nEnter a number.\n9 to end turn \n10 to view deck \n11 to viewdiscard \n12 to view stats");
            i = in.nextInt();
            if (i == 9) {
                System.out.println("draw: " + Card.getDraw());
                Card.discardHand();
                System.out.println("hand: " + Card.getHand());
                Run.PlayerTurn = false;
                break; // end turn
            } else if (i == 10) {// view deck
                System.out.println("Your deck is: " + Card.getDeck());
            } else if (i == 11) {// view discard
                System.out.println("Your discard is: " + Card.getDiscard());
            } else if (i == 12) {
                System.out.println("Stats: " + player);
            }else if(i==13){
                Floor.tempMob.mobIntent();
            }
            else if(i==14){
                System.exit(0);
            } else {
                player.play(i);
                System.out.println("played yaself");
            }
        }
        // check if all enemies are dead

    }

}
