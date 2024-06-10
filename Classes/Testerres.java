import java.util.*;

public class Testerres{
  
  public static void main(String[] args){
    
    Server sam = new Server("123", "passw0rd");
    
    Order one = new Order("Fried Chicken", "Mashed Potato", "Baked Potato");
    Order two = new Order("Baked Chicken", "Scalloped Potatoes", "Potato Salad");
    Order three = new Order("Chicken Nuggets", "Hash Browns", "Hash Browns");
    

    
    Customer c1 = new Customer(1234, 32455, one);
    Customer c2 = new Customer(245672, 35662, two);
    Customer c3 = new Customer(12345672, 4573, three);
    
    ArrayList<Customer> table1 = new ArrayList<Customer>();
    table1.add(c1);
    table1.add(c2);
    table1.add(c3);
    
    Table tab = new Table(4, 3, sam, table1);
    
    Payment p = new Payment(100, tab);
    
   // System.out.println(one.getEntree(one));
   
    //tab.getTableOrders();
    //System.out.println(
    
    //System.out.println(tab.getTableOrders());
    
    p.printReceipt(p);
    
    sam.addTable(tab);
   
    
    
  }
  
  
}