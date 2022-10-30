
//TODO add more cards
//TODO Add more enemies
//TODO create  enemy AI-- + Multi- enemy rooms


//TODO Devise Methods for Vuln and Strength - and debuffs -- mobs and player 
//TODO Create floor + fight generator



//Potions
//Relics??



public class Run {
  public static boolean PlayerTurn = true;
  public static boolean running = true;

  public static void main(String[] args) {
    // this file initializes the game, and starts the loop

    Card.deckInit(); 
  

    System.out.println("Welcome traveler...\n Your Deck contains: " + Card.getDeck());
    System.out.println("Intitalizing game elements");
    System.out.println("Stats: " + Room.player);
    Floor.startFloor();
    
    while (running) {

      if(PlayerTurn){
        Room.playerPhase();
      }

      if(!PlayerTurn){
        Room.enemyPhase();
      }

    }
    while (!running) {
      System.out.println("to shreds you say?");
      System.out.println("Stats: " + Room.player);
      break;
    }

  }

}
