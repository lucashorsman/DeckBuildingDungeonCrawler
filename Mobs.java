public enum Mobs {
   SLIME_S("Green Slime", false , false), 
   SLIME_M("Blue Slime", false, false ),
   SLIME_L("Red Slime" , false ,false );


   private final String color;
   private  Boolean IsVuln;
   private  Boolean IsWeak;






   private Mobs(String name, Boolean IsVuln, Boolean IsWeak){
      this.color = name;
      this.IsVuln = IsVuln;
      this.IsWeak = IsWeak;
      

   }

   public String getColor() {
      return color;
   }

   public Boolean getIsVuln() {
      return IsVuln;
   }

   public Boolean getIsWeak() {
      return IsWeak;
   }

   public void setIsVuln(Boolean IsVuln, int turn){
      this.IsVuln = IsVuln;
      
    final int initialFloor = Room.getFloor();


   }
   public void setIsWeak(Boolean isWeak) {
      IsWeak = isWeak;
   }



}
