import java.util.Scanner;
import java.util.ArrayList;

public class ServerDriver {

  ServerDriver(){
  
  Server current = new Server("","");
  
  int logOut = 1; // Switch for logging out of Server perspective
  
  while(logOut == 1) {
   // Option screen for Server
   System.out.println("1. Place Order");
   System.out.println("2. Manage Tables");
   System.out.println("3. Checkout Customer");
   System.out.println("4. Logout");
   System.out.println("Choose Task: ");
   
   // Scan choice
   Scanner s_input = new Scanner(System.in);
   int choice = s_input.nextInt();
   
   // Loop for choices
   
    
    if(choice == 1) { // Place Order
      System.out.println("Table: ");
      int table = s_input.nextInt();
      s_input.nextLine();
      
      // Look up table and add order to customer
          
      // Create order
      System.out.println("Entree: ");
      String entree = s_input.nextLine();
      
      System.out.println("Side1: ");
      String side1 = s_input.nextLine();
      
      System.out.println("Side2: ");
      String side2 = s_input.nextLine();
      
      current.makeOrder(entree, side1, side2);
      
      
      // Send to kitchen?
 
    }
    
    else if(choice == 2) { // Manage Tables
      System.out.println("1. View Tables");
      System.out.println("2. Add Table");
      
      int choice2 = s_input.nextInt();
      
      if(choice2 == 1) {
       
       //REPLACE CURRENT W/ PERSON
       current.getMyTables();
       
       
      
       
       // Search for server and print tables
       //s.tablesManaged(s.getMyTables); -> s will be particular server
   
      }
      
      else if(choice2 == 2) {
       System.out.println("Table: ");
       int table = s_input.nextInt();
       
       System.out.println("Customers: ");
       int peopleAt = s_input.nextInt();
       
       //current.addTable();
       
        
      }

      else {
       break;
      }
      
    }
    
    else if(choice == 3) { // Checkout Customer
      System.out.print("Table: ");
      int table = s_input.nextInt();
      
      Table t = current.getTable(table);
      current.checkOut(t);
      logOut = 0;
      break;
      
      // Look up table and checkout 
      //current.checkOut(t);
      
    }
    
    else if(choice == 4) { // Logout
      logOut = 0;
      break;
    }
    
    else {
      break;
    }
    
  }
  SystemDriver main = new SystemDriver(); // Return main screen 
              
 }
 
}