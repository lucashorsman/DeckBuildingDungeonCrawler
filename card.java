import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

class card {
    static List<String> Deck = new ArrayList<>(); // Every card object that exists in the game
    static List<String> DrawPile = new ArrayList<>(); // the draw pile -- at the start of a fight, is = to Deck
    // drawpile and deck are separate so that anything happening in gameloop (i.e
    // destruction of cards) does not affect next gameloop
    static List<String> Hand = new ArrayList<>(); // hand is the cards the player can use at a given time. add from deck
    static List<String> DiscardPile = new ArrayList<>(); // discard is where cards go after being played
    // add exhaust list -- far far far future

    public static int Cost;
    public static int Damage;
    public static int Block;
    public static String CardName_;

    public static void store(String cardName) {
        Deck.add(cardName);
      
    }

    public static void deckInit() {
        for (int i = 0; i < 5; i++) {
            if (i < 3) {
                card.store("strike");
            }

            if (i >= 3) {
                card.store("defend");

            }
        }
        card.store("bash");

    }

    // takes Cardname from user input -- eventually change input method to press a
    // number to pick card from hand
    public static void play(String cardName) {
        System.out.println("You played: " + cardName.toLowerCase());
        if (cardName == "strike" && Hand.contains(cardName)) {
            Damage = 5;
            player.ENG--;
            run.EnemyHP = run.EnemyHP - Damage; // eventuall store this in room.enemyhp

        }
    }

    // shuffles the Deck array, which stores every card the player has at any given
    // moment
    // shouldnt this shuffle drawpile --12am thoughts -- 1201, it should be drawpile
    // eventually but for now its fine
    // public static void shuffle() {
    // Collections.shuffle(DrawPile);
    // // integrate with discard eventually
    // }

    // runs once at beginning of round
    public static void createDrawPile() {
        for(String cardName_ : Deck){
            DrawPile.add(cardName_);
        }
        Collections.shuffle(DrawPile);
        // eventually implement something slightly more complex to handle exhausting
        // cards
    }

    // places cards into the players hand
    public static void DrawHand() {
        for (int j = 0; j < 3; j++) {
            CardName_ = DrawPile.get(j);
            DrawPile.remove(j);
            Hand.add(CardName_);
        }
    }

    public static List<String> viewDraw() {
        return DrawPile;
    }

    public static List<String> viewHand() {
        return Hand;

    }

    public static List<String> viewDiscard() {
        return DiscardPile;

    }

    public static List<String> viewDeck() {
        return Deck;

    }

    // end turn
    // discard

}

// class defend extends cards{

// public static void play(int Mob) {

// CardName = "defend";
// Cost = 1;
// Block = 5;

// System.out.println(CardName +" " + Cost + " " + Block);
// }

// }

// //if(CardName=="defend"){]