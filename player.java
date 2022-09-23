public class player {
    public static int PlayerHP = 50;
    public static int MaxPlayerHP = 50;
    public static int ENG = 3;
    public static int Strength = 1;
    public static int Dex = 1;
    public static int Block = 0;
    public static int Turn = 0;

    public static void player() {

    }

    public static void resetENG() {
        ENG = 3;
    }

    public static void resetBlock() {
        Block = 0;

    }

    public String toString() {
        return String.format("Player HP: %d MaxPlayerHP: %d ENG: %d Strength: %d Dex: %d Block: %d Turn: %d", PlayerHP,
                MaxPlayerHP, ENG, Strength, Dex, Block, Turn);

    }
}
