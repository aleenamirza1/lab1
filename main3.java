package Lab9;
import java.util.ArrayList;
import java.util.List;
public class main3 {
	 public static void main(String[] args) { 
		 List<String> cars = new ArrayList<String>();
		//Add items
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Toyota");
		 //Change items 
		cars.set(0, "Honda");
		 System.out.println(cars);}


}
