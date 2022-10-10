

public class Player {
    public static int PlayerHP = 50;
    public static int MaxPlayerHP = 50;
    public static int ENG = 3;
    public static int Strength = 1;
    public static int Dex = 1;
    public static int Block = 0;
    public static int Turn = 0;

    public static void Player() {

    }

    public void resetENG() {
        ENG = 3;
    }

    public static void resetBlock() {
        Block = 0;

    }

    public String toString() {
        return String.format("HP:%d/%d ENG:%d Strength:%d Dex:%d Block:%d Turn:%d", PlayerHP,
                MaxPlayerHP, ENG, Strength, Dex, Block, Turn);

    }


    public void play(int i) {
        Card cardName = Card.Hand.get(i);
       int CST = cardName.getCost();
       int BLK = cardName.getBlock();
       int DMG = 0;
        
        while(true){
if(Player.ENG>= CST){
        System.out.println("You played: " + cardName);
        Player.ENG -= CST;
        Player.Block += BLK;
        Room.EnemyHP -=DMG; // enemy should be stored in room
        Card.Hand.remove(Room.i); // maybe extract...
        break;
     }else{
        System.out.println("cant play " + cardName +" bc cost is too high" );
        break;
     }
}
    }
}
// }
