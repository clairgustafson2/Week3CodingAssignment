
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of int called ages
		
		int [] ages = new int[8];
		
		ages[0]= 3;
		ages[1]= 9;
		ages[2]= 23;
		ages[3]= 64;
		ages[4]= 2;
		ages[5]= 8;
		ages[6]= 28;
		ages[7]= 93;
		
		//Create an array of String called names
		String[] names = new String [6];
		
		names[0]= "Sam";
		names[1]= "Tommy";
		names[2]= "Tim";
		names[3]= "Sally";
		names[4]= "Buck";
		names[5]= "Bob";
		
		int totalLetters =0;
		
		for (String name : names) {
			totalLetters += name.length();
		} System.out.println(totalLetters);
		

	}

}
