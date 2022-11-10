import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Handles combat generation (i.e what enemies the next floor will contain)

public class Floor {
    static int Floor;
    static List<Mobs> MobList = new ArrayList<>();
    static Random rand = new Random();
    static int randommobint;
    static Mobs tempMob;

    public static int getRandommobint() {
        return randommobint;
    }

    public static void MobInit() {
        Mobs slime = new Slime();
        Mobs slimeL = new SlimeL();
        //Mobs cultist = new Cultist();
        // MobList.add(slime);
        // MobList.add(slimeL);
        MobList.add(new Cultist());
        randommobint = rand.nextInt(MobList.size());
        // store mob values
        // get random in similar way to play method in player

    }

    public static void startFloor() {
        MobInit();
        tempMob = MobList.get(randommobint);
        Room.EnemyHP = tempMob.getHP();
        System.out.println(tempMob + " Approaches! It's HP is " + Room.EnemyHP);
        Room.Turn = 0;
        Floor++;
        Card.createDrawPile();

    }

}
