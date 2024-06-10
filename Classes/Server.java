import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class Server {

 // To store current tables being managed 
 private ArrayList<Table> myTables;

 // Login information
 private String userID;

 private String passWord;

 // Constructor
 public Server(String u, String p) {

  this.userID = u;

  this.passWord = p;
  
  myTables = new ArrayList<Table>();

 }
 
 public String getID(){
   return this.userID;
 }
 

 // Add table 
 public void addTable(Table  t){
  
   this.myTables.add(t);
  
 }
 
 // Remove table
 public void removeTable(Table  t){
  
  this.myTables.remove(t);
  
 }
 
 // Prints tables managed
 public void tablesManaged(ArrayList<Table> t) {
  
  System.out.println(t);
 
 }

 // Create new order for customer
 public Order makeOrder(String entree, String side1, String side2) {
  
  Order newOrder = new Order(entree, side1, side2);
  
  return newOrder;

 }
 
 public Table getTable(int i){
   Server s = new Server ("", "");
   Table match = new Table(1, 2, s, null);
   for (int j = 0; j < myTables.size(); j++){
     Table temp = myTables.get(j);
     if (temp.getTableNumber() == i){
       match = temp;
       
     }
   }
   return match;
 }

 
 // Checkout a customers
  public void checkOut(Table t) {

   // Iterate through array list holding customers at given table
   for(Customer c : t.getAtTable()) {
    
   // Customer ready to pay?
    if(c.payBill("Yes")) { // Y
     
     if(c.paymentOption("cash")) { // Paying with cash
      Payment check = new Payment(c.getOrder().getOrderTotal(c.getOrder()),t);
     // System.out.println("Paid: "); // How much cash given?
      //Scanner givenC = new Scanner(System.in);
      //double paid = givenC.nextDouble();
     // check.payCash(check, paid);
      check.printReceipt(check); // Print Receipt
     }
     
     else { // Paying with card
      Payment check = new Payment(c.getOrder().getOrderTotal(c.getOrder()),t);
      check.payCredit(check);
      //check.printReceipt(check); // Print Receipt
     }
    }
    
    else { // N
     break;
    }
   }

  }
  
 // Getter for server tables
 public void getMyTables() {
   for (int i = 0; i < myTables.size(); i++){
     System.out.println("Table: " + myTables.get(i).strung());
   }
   

 }


}