

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        //init
        HashMap<Integer, String> CardList = new HashMap<Integer, String>();
        // cards[] DrawPile;
        // DrawPile = new cards[5]; 

        for(int i = 0; i<5; i++){
            if(i<3){
            CardList.put(i, "strike");
        }
         if (i>3){
            CardList.put(i, "defend");
         } 
    }
    // String CardinHand = DrawPile[4].toString(); 
    // String p = CardinHand.split("@")[0];



    //     try (Scanner in = new Scanner(System.in)) {
    //         System.out.print("what monster to play?");
    //   int s = in.nextInt();
    //     }
        System.out.println(CardList);
  
    }}

