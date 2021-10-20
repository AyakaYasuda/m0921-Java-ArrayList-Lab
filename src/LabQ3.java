import java.util.ArrayList;
import java.util.Comparator;

public class LabQ3 {
	

	public static void main(String[] args) {
		
		ArrayList<Car> arrayList = new ArrayList<>(3);
		
		Car mercedes = new Car("Mercedes", "M120", 2017);
		Car bmw = new Car("BMW", "B111", 2019);
		Car matsuda = new Car("Matsuda", "MZD", 2008);
		
		arrayList.add(mercedes);
		arrayList.add(bmw);
		arrayList.add(matsuda);
		
		arrayList.sort(Comparator.comparing(e -> e.year));
		System.out.println(arrayList);
		
		
	
	}

}
