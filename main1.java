package Lab9;
import java.util.ArrayList;
import java.util.List;
public class main1 {
	public static void main(String[] args) { 
		 List <String> cars = new ArrayList<String>();
		 //Add items
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Toyota");
		 System.out.println(cars);
		 
		 //Access items
		 System.out.println(cars.get(0));
		 System.out.println(cars.get(3));

}}
