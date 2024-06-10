import java.util.ArrayList;



public class Table {

 private ArrayList<Table> allTables; // All tables in restaurant

 private double totalFor; // Total cost of orders for table

 private int customerCount; // Number of customers at table

 private Server myServer; // Server of Table

 private final int all = 12; // Total amount of tables
 
 private int tableNumber; // Table number

 private ArrayList<Customer> atTable; // Orders at table


 int count = 0; // Track table availability

 

 public Table(int tableNum, int c, Server s, ArrayList<Customer> table) {

  this.myServer = s;
  this.customerCount = c;

  this.atTable = table;
  
  this.tableNumber = tableNum;

  count++;

 }

 // Returns table number
 public int getTableNumber() {
   return tableNumber;
 }

 public ArrayList<Order> getTableOrders(){

   ArrayList<Order> orders = new ArrayList<Order>();

   for (int i = 0; i < this.atTable.size(); i++){

     Customer c = this.atTable.get(i);

     Order o = c.getOrder();

     orders.add(o);

   }

   return orders;

 }


 public ArrayList<Customer> getAtTable(){

   return atTable;

 }


 public void addToTable(Customer c){

   atTable.add(c);

 }

 // Checks if more tables are available to sit customers
 public Boolean isAvailable() {

  if(count >= all) {

   return false; 

  }

  else {

   return true;

  }

 }

public double getTotalFor() {
 return totalFor;
}

public void setTotalFor(double totalFor) {
 this.totalFor = totalFor;
}

public String strung(){
  String t = "" + this.tableNumber;
  return t;
}


}