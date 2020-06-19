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
		int [] newAges = new int[] {3, 9, 23, 64, 2, 8, 28, 93,13};
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
		int totalLetters =0;
		double totalNames =6;
		
		for (String name : names) {
			totalLetters += name.length();	
		} 
		System.out.println(totalLetters/totalNames);
		
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
		int [] nameLengths= new int [] {12, 13, 22, 89, 6, 5, 90};		

	}

}
