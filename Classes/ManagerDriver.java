import java.util.Scanner;
import java.util.ArrayList;


public class ManagerDriver {

 ManagerDriver(){
  
  Manager current = new Manager("","");
  
  int logOut = 1; // Switch for logging out of Manager perspective
  
  while(logOut == 1) {
   // Option screen for Manager
   System.out.println("1. Edit Order");
   System.out.println("2. Remove/Add/Modify Server");
   System.out.println("3. Apply discount");
   System.out.println("4. Logout");
   System.out.println("Choose Task: "); 
   
   // Scan choice
   Scanner m_input = new Scanner(System.in);
   int choice = m_input.nextInt();
   
   // Loop for choices
   while(choice != 4) {
    
    if(choice == 1) { // Edit Order
      System.out.println("Table: ");
      int table = m_input.nextInt();
    
      
      //current.modifyTableOrder();
      
      // Look up table and edit order 
      //current.modifyTableOrder(t);
      break;
    }
    
    else if(choice == 2) { // Remove/Add/Modify Server
      System.out.println("Enter '+' to add new server or '-' to remove  or 'm' to modify password");
      String edit = m_input.next();
      
      if(edit.equals("+")) {
       System.out.println("Enter userID and password");
       
       System.out.println("New userID: ");
       String id = m_input.next();
       
       System.out.println("New password: ");
       String password = m_input.next();
       
       current.addServer(id, password);
       break;
      }
      
      else if(edit.equals("-")) {
       System.out.println("Enter userID: ");
       String id = m_input.next();
       
       EmployeeRoster e = new EmployeeRoster();
       e.deleteEntry(id);
       
       // Look up server and delete them (use file)
       // current.deleteServer(s);
       break;
      }
      
      else if(edit.equals("m")) {
       System.out.println("Enter userID: ");
       String id = m_input.next();
       
       System.out.println("Enter new Password: ");
       String newPass = m_input.next();
       
       EmployeeRoster e = new EmployeeRoster();
       e.changePassword(id, newPass);
       
       // Look up server and change password, then add new Server instance to file
       break;
      }
      else {
       break;
      }
    }
    
    else if(choice == 3) { // Apply Discount
      System.out.print("Table: ");
      int table = m_input.nextInt();
      
     

     
      
      // Look up table and apply discount 
      //current.applyDiscount(t);
      break;
    }
    
    else if(choice == 4) { // Logout
      logOut = 0;
     
    }
    
    else {
      logOut = 0;
    }
    
   }
  }
  SystemDriver main = new SystemDriver(); // Return main screen 
 }
 
}