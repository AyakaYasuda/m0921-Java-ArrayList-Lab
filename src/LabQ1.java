import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LabQ1 {
	
	public static ArrayList<Integer> random = new ArrayList<>();

	public static void main(String[] args) {
		
		random = getRandom(50, 10);
		for (int i = 0; i < random.size(); i++) {
			System.out.println(random.get(i));
		}
		System.out.println(random);
		search();
		
	}
	
	public static ArrayList<Integer> getRandom(int range, int size) {
		
		ArrayList<Integer> randomNums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			randomNums.add(new Random().nextInt(range) + 1);
		}
		return randomNums;
		
	}
	
	
	static void search() {
		
		Scanner scan = new Scanner(System.in);
		int numSearch = scan.nextInt();
		
		if (random.contains(numSearch)) {
			System.out.println("the number is in the list");
		}else {
			System.out.println("the number is not in the list");
		}
	}

}


