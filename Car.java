public class Car {
   /* State: fields
      Behavior: function or method
   */

   // state
   private int doors;
   private int wheels;
   private String model;
   private String engine;
   private String colour;

   // behaviour.
   // setter
   public void setModel(String model) {
       this.model = model;
   } 
  
   // getter
   public String getModel() {
       return this.model;
   }
}
