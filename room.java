import java.util.Scanner;

public class Room {
    static Player player = new Player();
    public static int Floor = 0;
    public static int getFloor() {
        return Floor;
    }

    public static int i;
    public static Scanner in = new Scanner(System.in);
    public static int EnemyHP = 10; // store in room.java
    public static int playerTurn = 0;
    public static void startFloor() {

        // generate mob to fight
        playerTurn = 0;
        Floor++;
        Card.createDrawPile();
        

    }

    public static void enemyPhase() {
        
        System.out.println("-------------------------------------------------");
        player.resetENG();
        System.out.println("EnemyTurnHere");
        Run.PlayerTurn = true;
        

    }

    public static void playerPhase() {
        // check if draw pile >=3 then move on, else combine draw +discard then shuffle,
        // then draw
        playerTurn++;
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
            } else {
                player.play(i);
                System.out.println("played yaself");
            }
        }
        // check if all enemies are dead

    }

}
