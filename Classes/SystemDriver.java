/*
 * This is the main driver class to be run
 * 
 * 
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class SystemDriver {
 
 SystemDriver(){
  System.out.println("**********************************************************\n"
    + "**********************************************************\n"
    + "**************                              **************\n"
    + "**************    WELCOME TO CHICKEN POT    **************\n"
    + "**************                              **************\n"
    + "**********************************************************\n"
    + "**********************************************************");
  
  // Login to system
  System.out.println("Login");
  Scanner sc = new Scanner(System.in);

  // Enter user ID
  System.out.println("User ID: ");
  String userID = sc.next();

  
  // Enter user password
  System.out.println("Password: ");
  String passWord = sc.next();

  
  EmployeeRoster re = new EmployeeRoster();
  ArrayList<String> info = re.searchFile(userID);
  
  String password = info.get(2);
  String pos = info.get(0);
  
  if (password.equals(passWord)){
    if (pos.equals("Manager")){
      ManagerDriver man = new ManagerDriver();
    }
    else if(pos.equals("Server")){
      ServerDriver serve = new ServerDriver();
    }
  }
  else {
    System.out.println("Incorrect password!");
  }
  
  
  //sc.close(); // Close scanner
 }
 
 public static void main(String[] args) {
   
   EmployeeRoster r = new EmployeeRoster();
   
   Staff user1 = new Staff("Manager", "1234", "qu");
   r.addToFile(user1);
   Staff user2 = new Staff("Manager", "2345", "tt");
   r.addToFile(user2);
   Staff user3 = new Staff("Server", "3456", "wu");
   r.addToFile(user3);
   Staff user4 = new Staff("Server", "4567", "as");
   r.addToFile(user4);
   
   Server three = new Server("3456", "wu");
   
   
   SystemDriver run = new SystemDriver();
   
 
   
   
 }
}