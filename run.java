import java.util.Scanner;

public class run {
  public static int EnemyHP = 5; // store in room.java

  public static void main(String[] args) {
    // this file initializes the game, and starts the loop
    player player = new player();
    Scanner in = new Scanner(System.in);
    // card.play("strike");
    card.deckInit();
    System.out.println(card.Deck);
    
    card.createDrawPile();
    System.out.println(card.viewDeck());
    System.out.println(card.viewDraw());
    card.DrawHand();
    System.out.println(card.viewDeck());
    System.out.println(card.viewDraw());
    boolean running = true;
    while (running) {
      System.out.println("Welcome traveler...\n Your Deck contains: " + card.viewDeck());
      System.out.println("Intitalizing game elements");
      String s;
      System.out.println("what card to play?");
      s = in.nextLine();
      card.play(s);
      in.close();
      break;

    }

  }
}
