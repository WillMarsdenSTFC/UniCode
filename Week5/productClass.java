package Week5;

public class productClass {
   private int ID;
   private String Name;
   private int Quantity;
   
   public productClass(int id, String name, int quantity) {
    ID = id;
    Name = name;
    Quantity = quantity;
   }

   public int getID() {
    return ID;
   }
   public String getName() {
    return Name;
   }
   public int getQuantity() {
    return Quantity;
   }

   public void setID(int newID) {
    ID = newID;
   }
   public void setName(String newName) {
    Name = newName;
   }
   public void setQuantity(int newQuantity) {
    Quantity = newQuantity;
   }
}
