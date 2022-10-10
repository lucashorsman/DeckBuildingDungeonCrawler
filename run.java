import java.util.Scanner;
// maybe i need to bring both methods here, and use a state machine to control whos turn it is
public class Run {
  public static boolean PlayerTurn = true;
  public static boolean running = true;

  public static void main(String[] args) {
    // this file initializes the game, and starts the loop

    Card.deckInit(); 
    

    System.out.println("Welcome traveler...\n Your Deck contains: " + Card.getDeck());
    System.out.println("Intitalizing game elements");
    System.out.println("Stats: " + Room.player);
    Room.startFloor();
    
    while (running) {

      if(PlayerTurn){
        Room.playerPhase();
      }

      if(!PlayerTurn){
        Room.enemyPhase();
      }

    }
    while (!running) {
      System.out.println("Stats: " + Room.player);
      System.out.println("to shreds you say?");
      break;
    }

  }

}
