import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Staff
{ 
 private String position;
 private String ID;
 private String passWord;
 
 // This function stores staff information, including position (Manager or Server), IDs, and passwords
 public Staff(String pos ,String userID, String pass)
 {
  position = pos;
  ID = userID;
  passWord = pass;
 
 }
 
 public String getPosition()
 {
  return position;
 }
 
 public String getID()
 {
  return ID;
 }
 
 public String getPassword()
 {
  return passWord;
 }
 
}