public class Order {

 private String e;

 private String s1;

 private String s2;
 
 private Boolean sentToKitchen;
 
// Getter
 public Boolean getSentToKitchen() {
	return sentToKitchen;
}

// Constructor
 public Order(String entree, String side1, String side2) {

  this.e = entree;

  this.s1 = side1;

  this.s2 = side2;

 }


 // Sends order to kitchen
 public boolean sendOrder(Order n) {

   // send to the kitchen for confirmation
	 n.sentToKitchen = true;
	 
	 return n.sentToKitchen;
	 

 }


 public String getEntree(Order o){

   return this.e;

 }


 public String getSide1(Order o){

   return this.s1;

 }

 
 public String getSide2(Order o){

   return this.s2;

 }

 // Allows for editing of order 
 public void editOrder(Order o) {

   String e = o.getEntree(o);

   String s1 = o.getSide1(o);

   String s2 = o.getSide2(o);


   this.e = e;

   this.s1 = s1;

   this.s2 = s2;

 }

 public double getOrderTotal(Order o){

   double total = 0.0;

   String en = o.getEntree(o);

   String s1 = o.getSide1(o);

   String s2 = o.getSide2(o);
   

   Menu men = new Menu();



   total += men.getEntreePrice(en);

   total += men.getSidePrice(s1);

   total += men.getSidePrice(s2);


   return total;

 }

}