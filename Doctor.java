public class Doctor extends Person {// we are extending person with a doctor person
	
	// we set the doctor attributes and they must be called before our constructor, or else it will not work
  public String Ranking;
  public int yearsExperiance;
	 
  public Doctor(String Ranking, int yearsExperiance, int height, String hairColour, boolean over18) { // in order to use the extends of person we need to add in the Person Attributes into our construtors including our Doctor attributes 
		super(height, hairColour, over18);//we always need to call  the super values first in order. if i add it after my doctor code it will not work.
		this.Ranking = Ranking; // we now set the constuctor with the correct values for doctor
		this.yearsExperiance = yearsExperiance; 
	}

public String getYearsExperiance() { //This method creates a condition to determine the Ranking for the docotor based on their experience
	
// if the docter has greater than and equal to 0 years experience and less than 6 years or equal to then the doctor will be ranked as a medical student and the code carrys on in this mannor determining the rank based on experience
		if (yearsExperiance >= 0 && yearsExperiance <= 6 ) { 
			return	Ranking += " Medical student";
			
		} else if (yearsExperiance >= 7 && yearsExperiance <= 8) {
			return	Ranking += " Intern";
			
		}else if (yearsExperiance >= 9 && yearsExperiance <= 16) {
			return	Ranking += " Resident";
			
		}else if (yearsExperiance >= 17 && yearsExperiance <= 20) {
			return	Ranking += " Fellow";
			
		}else if (yearsExperiance >= 21) {
			return	Ranking += " Attending";
			
		}
		return Ranking;
		 
	}
//we now call our created objects to the toString method, it will out put them each in the below sequence 
public String toString() {
	 String output = "The Doctor's height is: " + height + " feet tall \n";
	 output += "The Doctor's Hair colour is: " + hairColour + "\n";
	 output += "Is this Doctor over 18: " + over18 + "\n";
	 output += "This Doctor has " + yearsExperiance + " years experience \n";
	 output += "So this makes this Doctor a:" + getYearsExperiance(); // this is where we call our Get years Experience method to display the rank
	
	 return output;
}


public static void main(String[] args) {
	Doctor Doc = new Doctor("", 9 , 6, "Grey", true); // we create a new Doctor with new attributes and we leave an empty string to determine the type of doctor based on the years of experience
	
	  System.out.println(Doc); // We now print out the new doctor person with his attributes 
 }
}

// reference :
// all references are on the main person class  Person.java
 