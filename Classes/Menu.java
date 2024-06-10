import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Menu 
{
	private Map<String, Double> e = new HashMap<String, Double>();; //Store entree item/price
	private Map<String,Double> s = new HashMap<String, Double>();; //Store sides item/price
	
	public Menu() 
	{
		// Entree options
		e.put("Fried Chicken", 14.99);
		e.put("Roasted Chicken", 18.99);
		e.put("Grilled Chicken", 14.99);
		e.put("Baked Chicken", 9.87);
		e.put("Chicken Nuggets", 15.00);
		e.put("Chicken Noodle Soup", 20.00);
		e.put("Sweet and Sour Chicken", 15.00);
		e.put("Chicken Pot Pie", 67.00);
		e.put("Herbed Chicken Parmesan", 29.99);
		e.put("Roast Chicken with Balsamic Bell Peppers", 51.37);
	
		// Side options
		s.put("French Fries", 6.97);
		s.put("Mashed Potato", 2.99);
		s.put("Baked Potato", 1.06);
		s.put("Scalloped Potatoes", 2.31);
		s.put("Hash Browns", 1.00);
		s.put("Potato Wedges", 3.33);
		s.put("Garlic Butter Potatoes", 4.00);
		s.put("Potato Salad", 4.20);
		s.put("Potato Pancakes", 2.50);
		s.put("Tater tots", 6.66);
		s.put("Potatoes Au Gratin", 20.00);
		s.put("Cacio e Pepe Potatoes", 53.90);
	}

public double getEntreePrice(String en){
   double price = e.get(en);
   return price;
   
 }
 
 public double getSidePrice(String sp){
   double price = s.get(sp);
   return price;
 }


}