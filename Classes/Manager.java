import java.util.Scanner;
import java.util.*;

public class Manager 
{
 
 // Login information
 private String userID;

 private String passWord;

 // Constructor
 public Manager(String u, String p) {

  u = this.userID;
  
  p = this.passWord;

 }



 // Adds server
 public void addServer(String u, String p) {

  // Create new server
  Server newServer = new Server(u,p);

  EmployeeRoster r = new EmployeeRoster();
  
  Staff server = new Staff("Server", u, p);
  
  r.addToFile(server);
  
 }


 public void modifyTableOrder(Table t) {
   
   ArrayList<Order> order = t.getTableOrders();

   for (int i = 0; i < order.size(); i++){
     System.out.println(order.get(i).getEntree(order.get(i)));
     System.out.println(order.get(i).getSide1(order.get(i)));
     System.out.println(order.get(i).getSide2(order.get(i)));
   }

 }


 public void applyDiscount(Table t) {

  // will access table total and apply discount percentage
  double discount = t.getTotalFor() - (.10*t.getTotalFor());
  t.setTotalFor(discount);
  
 }

}