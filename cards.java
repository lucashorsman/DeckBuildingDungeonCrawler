import java.util.Dictionary;
import java.util.Hashtable;

class cards {
            public static int Cost;
            public static int Damage;
            public static int Block;
            public static String CardName = "";


            



}

class strike extends cards{


    public static void play(int Mob) {

        CardName = "strike";
        Cost = 1;
        Damage = 5;
    
        System.out.println(CardName +" " + Cost + Mob);
    }


}
class defend extends cards{


    public static void play(int Mob) {

        CardName = "defend";
        Cost = 1;
        Block = 5;
        
    
        System.out.println(CardName +" " + Cost + " " + Block);
    }


}
  
         

//if(CardName=="defend"){]