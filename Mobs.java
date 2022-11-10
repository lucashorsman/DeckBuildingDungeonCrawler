import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Mobs {

   String name;
   Boolean IsVuln;
   Boolean IsWeak;
   static int HP;
   private static final Random RANDOM = new Random();

   public String getColor() {
      return name;
   }

   public Boolean getIsVuln() {
      return IsVuln;
   }

   public Boolean getIsWeak() {
      return IsWeak;
   }

   public void setIsVuln(Boolean IsVuln, int turn) {
      this.IsVuln = IsVuln;

   }

   public void setIsWeak(Boolean isWeak, int turn) {
      this.IsWeak = isWeak;

   }

   int getHP() {
      return HP;
   }

   void mobTurn() {

   }

   public String toString() {
      return "x";
   }

   public void mobIntent() {
   }

}

class Slime extends Mobs {
   static int HP = 8;
   static int strength = 1;

   int getHP() {
      return HP;
   }

   void mobTurn() {

   }

   public String toString() {
      return "Slime";
   }

}

class SlimeL extends Mobs {
   static int strength = 1;

   static int HP = 15;

   int getHP() {
      return HP;
   }

   void mobTurn() {

   }

   public String toString() {
      return "Big Slime";
   }
}

class Cultist extends Mobs {
   static int baseATK = 3;
   static int strength = 0;
   static int HP = 36;
   static boolean IsRitual = false;

   public int getHP() {
      return HP;
   }

   private int attackValue() {

      return baseATK + strength;

   }

   public void mobTurn() {
      int CurrentTurn = Room.getTurn();
      if (CurrentTurn == 1) {
         Ritual(true);
         System.out.println("Cultist Prays...");
      } else if (CurrentTurn > 1) {
         Player.applyDamage(attackValue());
         System.out.println("Cultist attacks for " + attackValue());

      }
      if (IsRitual) {
         System.out.print("Cultist Gained 3 Strength From its Ritual!");
         addStrength(3);
      }
   }

   private void addStrength(int strengthValue) {
      strength += strengthValue;
   }

   public void mobIntent() {
      int CurrentTurn = Room.getTurn();
      if (CurrentTurn == 1) {

         System.out.println("Cultist Will Pray - Ritual Adds 3 Strength each turn");
      } else if (CurrentTurn > 1) {

         System.out.println("Cultist will attack for " + attackValue());

      }

   }

   private void Ritual(Boolean x) {
      if (x) {
         IsRitual = true;
      } else {
         IsRitual = false;
      }

   }

   public String toString() {
      return "Cultist";
   }
}