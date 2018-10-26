package lamdaDemo;

import java.util.ArrayList;
import java.util.List;

public class LamdaUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<String>();
		li.add("Sagar");
		li.add("Amit");
		li.add("Rajesh");
		
//		li.forEach(nameList -> System.out.println(nameList));
		
		li.forEach(namelist ->{if (namelist == "Sagar"){System.out.println(namelist);}});
		
	}

}
