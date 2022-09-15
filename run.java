import java.util.Arrays;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        //init
        cards[] DrawPile;
        DrawPile = new cards[5]; 

        for(int i = 0; i<5; i++){
            if(i<3){
            DrawPile[i] = new strike();
        }
         if (i>3){
            DrawPile[i] = new defend();
         } 
    }
    String CardinHand = DrawPile[4].toString(); 
    String p = CardinHand.split("@")[0];



        Scanner in = new Scanner(System.in);
        System.out.print("what monster to play?");
       int s = in.nextInt();
      System.out.println(p);
  
    }}

