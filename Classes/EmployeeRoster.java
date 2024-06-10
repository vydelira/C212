import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List; 
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class EmployeeRoster{
  
  private File roster = new File("roster.txt");
  
  public void addToFile(Staff s){
   
    try {
      FileWriter f = new FileWriter(roster, true);
      PrintWriter out = new PrintWriter(f);
    
      String position = s.getPosition();
      String id = s.getID();
      String password = s.getPassword();
    
      String in = position + ", " + id + ", " + password;
    
      out.println(in);
      out.close();
      
    } catch(Exception fnf){
      System.out.println(fnf.getMessage());
    }
    
  }
  
  public ArrayList<String> searchFile(String id){
    
    try{
      Scanner file = new Scanner(roster);
      
      ArrayList<String> staff = new ArrayList<String>();
      
      while (file.hasNextLine()){
        staff.add(file.nextLine());
    
      }
      
      ArrayList<String> positions = new ArrayList<String>();
      ArrayList<String> ids = new ArrayList<String>();
      ArrayList<String> passwords = new ArrayList<String>();
      for (int i = 0; i < staff.size(); i++){
        String current = staff.get(i);
        List<String> temp = Arrays.asList(current.split(", "));
        positions.add(temp.get(0));
        ids.add(temp.get(1));
        passwords.add(temp.get(2));
      }
      
      int employeePosn = 0;
      
      for (int j = 0; j < ids.size(); j++){
        if (ids.get(j).equals(id)){
          employeePosn = j;
        }
      }
      
      String position = positions.get(employeePosn);
      String ide = ids.get(employeePosn);
      String pass = passwords.get(employeePosn);
      
      ArrayList<String> information = new ArrayList<String>();
      information.add(position);
      information.add(ide);
      information.add(pass);
      
      
      return information;
    
     } catch(FileNotFoundException fnf){
       ArrayList<String> error = new ArrayList<String>();
       error.add(fnf.getMessage());
       return error;
    }
    
  }
  
  public void deleteEntry(String id){
    try{
      
      File in = new File("roster.txt");
      File out = new File("tempRoster.txt");
      
      BufferedReader read = new BufferedReader(new FileReader(in));
      BufferedWriter wr = new BufferedWriter(new FileWriter(out));
      
      ArrayList<String> info = searchFile(id);
      String remove = info.get(0) + ", " + info.get(1) + ", " + info.get(2);
      
      String current;
      
      while((current = read.readLine()) != null){
        String newline = current.trim();
        if(newline.equals(remove)) continue;
        wr.write(current + System.getProperty("line.separator"));
      }
      
      read.close();
      wr.close();
      out.renameTo(in);
      
      
    
     } catch(Exception fnf){
       System.out.println("Error: " + fnf.getMessage());
    }
    
  }
  
  public void changePassword(String id, String pass){
    try{
      
      File in = new File("roster.txt");
      File out = new File("tempRoster.txt");
      
      BufferedReader read = new BufferedReader(new FileReader(in));
      BufferedWriter wr = new BufferedWriter(new FileWriter(out));
      
      ArrayList<String> info = searchFile(id);
      String oldpass = info.get(0) + ", " + info.get(1) + ", " + info.get(2);
      Staff newe = new Staff(info.get(0), info.get(1), pass);
      
      String current;
      
      while((current = read.readLine()) != null){
        String newline = current.trim();
        if(newline.equals(oldpass)) continue;
        wr.write(current + System.getProperty("line.separator"));
      }
      
      read.close();
      wr.close();
      out.renameTo(in);
      
      addToFile(newe);
      
      
    
     } catch(Exception fnf){
       System.out.println("Error: " + fnf.getMessage());
    }
  }
    
  
    
   
 
}