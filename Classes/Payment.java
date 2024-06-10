import java.util.*;


public class Payment {

 // Constructor - Instance variable
 // will access table total and set to toPay
 private double toPay;
 private Table t;
 
 public Payment(double toPay, Table t)
 {
  this.toPay = toPay;
  this.t = t;
 }
 
 public double getToPay()
  {
  return toPay;
  }
    
 public Table getT()

 {
  return t;
 }
 
 // For customers paying with cash
 public Payment payCash(Payment p, double given) 
 {
  // the total is equivalent to toPay;
  if(given == p.toPay)
  {
   p.toPay = 0;
   return p;
  }
  else
  {
   double total = p.toPay;
   double change = total - given;
           
   p.toPay = change;
   return p;
  }
 }
     
 // will check if given amount matches total
 // will return change amount if not
 // if exact, will change total to 0
 
 // For customers paying with card

 public double payCredit(Payment p) {
  Scanner in = new Scanner(System.in);
   
  // prompt for credit card number
  System.out.println("Credit card number: ");
  String cardNumber = in.nextLine();

  // prompt for PIN
  System.out.println("\n Enter 4-digit pin:");
  String cardPin = in.nextLine();
  
  // change total to 0
  if(cardPin.length() == 4)
  {
   System.out.println("Transaction approved");
   p.toPay = 0;
  }
  else
  {
   System.out.println("Enter a valid 4-digit pin");
   cardPin = in.nextLine();
  }
  return p.toPay;
 }

 // Prints receipt
public void printReceipt(Payment p) {
   
   String receipt = "Thank you for eating with us!\n\n";
   
   ArrayList<Order> orders = t.getTableOrders();
   
   double tableTotal = 0;
   
   for(int i = 0; i < orders.size(); i++){
     Order a = orders.get(i);
     double total = a.getOrderTotal(a);
     receipt += "Entree: ";
     receipt += a.getEntree(a);
     receipt += "\nSides: ";
     receipt += a.getSide1(a) + " & " + a.getSide2(a);
     receipt += " ......";
     receipt += "$" + total;
     receipt += "\n-----------------------------\n";
     
     tableTotal += total;
   }
   
   double tip = tableTotal * 0.2;
   
   double grand = tip + tableTotal;
   
   receipt += "\n Total: " + "$" + tableTotal;
   receipt += "\n Gratuity: " + "$" + tip;
   receipt += "\n\n Grand Total: " + "$" + grand;
       
   System.out.println(receipt);
     
   }
   

  // Will access all customer orders and prices
  // add 20% gratuity
  // print total on bottom
 
}