import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;


class card {
    static List<String> Deck = new ArrayList<>(); // Every card object that exists in the game
    static List<String> DrawPile = new ArrayList<>(); // the draw pile -- at the start of a fight, is = to Deck
    static List<String> Hand = new ArrayList<>(); // hand is the cards the player can use at a given time. add from deck
    static List<String> Discard = new ArrayList<>(); // discard is where cards go after being played
    //add exhaust list -- far far far future

    public static int Cost;
    public static int Damage;
    public static int Block;
    public static String CardName_;

    public static void store(String CardName){
        Deck.add(CardName);

    }
    public static void init(){
        for(int i = 0; i<5; i++){
            if(i<3){
            Deck.add("strike");
        }

         if (i>=3){
            Deck.add("defend");

         } 
    }
    }
    public String toString(){
        return "hi " + Cost +" "+ Damage + CardName_ + Block ;

    }
}




// class defend extends cards{


//     public static void play(int Mob) {

//         CardName = "defend";
//         Cost = 1;
//         Block = 5;
    

//         System.out.println(CardName +" " + Cost + " " + Block);
//     }


// }

        

// //if(CardName=="defend"){]