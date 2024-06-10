import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;



public class EmployeeTester{
  
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
    
    r.deleteEntry("2345");
    
    r.changePassword("4567", "gh"); 
  }
}