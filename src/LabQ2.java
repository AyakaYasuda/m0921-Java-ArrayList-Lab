import java.util.ArrayList;
import java.util.Random;

public class LabQ2 {
	
	public static ArrayList<Integer> random = new ArrayList<>();
	public static ArrayList<Integer> copy = new ArrayList<>();

	public static void main(String[] args) {
		
		random = getRandom(50, 10);
		for (int i = 0; i < random.size(); i++) {
			random.get(i);
		}
		System.out.println("the original arraylist: " + random);
		
		copy = random;
//		System.out.println(copy);
		replace(9, -5);
		System.out.println("copy of the arraylist: " + copy);
		

	}
	
	public static ArrayList<Integer> getRandom(int range, int size) {
		
		ArrayList<Integer> randomNums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			randomNums.add(new Random().nextInt(range) + 1);
		}
		return randomNums;
		
	}
	
	static void replace(int position, int newNum) {
		copy.set(position, newNum);
	}

}
