package edu.monmouth.problemSet1;


public class ProblemSet1 {

	public ProblemSet1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//initialize variable (firstInstrument) and basically just print a null instrument by calling all the attributes
		MusicalInstrument firstInstrument = new MusicalInstrument();
		System.out.println("instrument name is  " + firstInstrument.getName());
		System.out.println("instrument name is  " + firstInstrument.getType());
		System.out.println("instrument name is  " + firstInstrument.getNumberOfKeysorStrings());
		
		//make the variable that you just initialized an actual instrument
		firstInstrument.setName("bagpipes");
		firstInstrument.setType("Woodwind");
		firstInstrument.setNumberOfKeysorStrings(7); //idk anything about bagpipes but google said they have 7 keys
		
		//print out all the updated attributes
		System.out.println("instrument name is: " + firstInstrument.getName());
		System.out.println("instrument type is: " + firstInstrument.getType());
		System.out.println("Instrument has " + firstInstrument.getNumberOfKeysorStrings() + " keys.");
		
		//initialize another variable
		MusicalInstrument secondInstrument = new MusicalInstrument("guitar", "string", 6);
		
		//print the new instrument
		System.out.println("instrument name is: " + secondInstrument.getName());
		System.out.println("instrument type is: " + secondInstrument.getType());
		System.out.println("Instrument has " + secondInstrument.getNumberOfKeysorStrings() + " strings.");
		
		


	}

}
