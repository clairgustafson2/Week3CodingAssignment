public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1. Create an array of int called ages
		int [] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		
		//1a. subtract the first element in the array from the last element in the array
		int first = ages[0];
		int last = ages[ages.length-1];
		System.out.println(last-first);
		
		//1b. add new age. 13 was added
		int [] newAges = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 13};
		int first1 = newAges[0];
		int last1 = newAges[newAges.length-1];
		System.out.println(last1-first1);
		
		//1c. average of ages in array
		double average = 0;
		
		for (int i=0; i<ages.length; i++) {
			average= average + ages[i];
		}
		double total = average/ages.length;
		 
		System.out.println(total);
		
		
		//Step 2. Create an array of String called names
		String[] names = new String [] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2a. Calculate the average numbers of letters per name
		double totalLetters =0;
		
		for (String name : names) {
			totalLetters += name.length();	
		} 
		System.out.println(totalLetters/names.length);
		
		//2b. Concatenate all the names together and separated by spaces
		StringBuilder combineNames = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
		   combineNames.append(names[i] + " ");
		}
		String newString = combineNames.toString();

		System.out.println(newString);
		
		//3 How do you access the last element of any array?
		
		//4 How do you access the first element of any array?
		
		//5 Create a new array of int called nameLengths. 
		int [] nameLengths= new int[] {5, 6, 3, 5, 6, 8, 3, 4};		
			
		for (String name : names) {
			totalLetters += name.length();
	}
		System.out.println(totalLetters);
		
		//6 Write a loop to iterate over the nameLengths array
		
		//7 Write a method that takes a String, word, and an int
		System.out.println(repeatWords("Hello", 4));
		
		//8 firstName and lastName
		String firstName = "Clair";
		String lastName = "Gustafson";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
		//9 Create method, int array, and return true if greater than 100
		int [] numbers = new int [] {2, 7, 4, 9, 13, 56, 34, 45};
		
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println(isTrue(sum));
		
		//10 Array of doubles
		double[] grades = new double[] {45.6, 32.7, 88.7, 13.5, 12.5, 66.4, 78.7, 89.6, 98.1};
		
		System.out.println(doubleAverage(grades));
		
		//11 Two arrays of double
		
		//12 Is it hot outside and do I have money in my pocket?
		double moneyInPocket = 12.45;
		boolean isHotOutside = true;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
	}
	//7 Method repeatWords
	public static String repeatWords(String word, int n) {
		String repeat = "";
		
		while(n>0) {
			repeat += word;
			n -=1;
		}
		return repeat;
	}
	
	//8 Method createFullName
	public static String createFullName(String x, String y) {
			return x + " " + y;
		}
	
	//9 Method isTrue
	public static boolean isTrue (int sum) {
		return (sum > 100);		
	}
	
	//10 Method doubleAverage
		public static double doubleAverage(double[] arrays) {
			double sum =0;
			for (double array : arrays) {
				sum += array;
			}
			return sum/arrays.length;
	}
	
		//11 Method whichIsGreater
//		public static boolean whichIsGreater (double[] x, double[] y) {
//			
//			if (x>y && y<x) {
//				return true;
//			}
//			
//		}
		
	//12 Method willBuyDrink
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return (isHotOutside == true && moneyInPocket > 10.5);
		}
}

