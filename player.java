
public class Player {
    public static int PlayerHP = 50;
    public static int MaxPlayerHP = 50;
    public static int ENG = 3;
    public static int Strength = 1;
    public static int Dex = 1;
    public static int Block = 0;


    public static void Player() {

    }

    public void resetENG() {
        ENG = 3;
    }

    public void resetBlock() {
        Block = 0;

    }

    public String toString() {
        return String.format("HP:%d/%d ENG:%d Strength:%d Dex:%d Block:%d ", PlayerHP,
                MaxPlayerHP, ENG, Strength, Dex, Block);

    }

    public void play(int i) {
        Card cardName = Card.Hand.get(i);
        int CST = cardName.getCost();
        int BLK = cardName.getBlock();
        int DMG = cardName.getDamage();

        if (Player.ENG >= CST) {
            System.out.println("You played: " + cardName);
            ENG -= CST;
            Block += BLK;
            Room.EnemyHP -= DMG; // enemy should be stored in room
            Card.discardCard(i);
        } else {
            System.out.println("cant play " + cardName + " bc cost is too high");
        }

    }

    public static void applyDamage(int attackDamage) {
        int tempatk = attackDamage;
        
        tempatk -= Block;
        PlayerHP -= tempatk;

    }
}
// }
