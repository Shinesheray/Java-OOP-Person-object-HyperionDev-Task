
public class Scientist extends Person {// we are extending person with a scientist person
	
public String labCoat; // we set the Scientists attributes and they must be called before our constructor, or else it will not work
public String typeScientist;
	
 public Scientist(String labCoat, String typeScientist, int height, String hairColour, boolean over18) { // in order to use the extends of person we need to add in the Person Attributes into our construtors including our Scientist attributes 
		super(height, hairColour, over18);//we always need to call  the super values first in order. if i add it after my scientist code it will not work.
		
		this.labCoat = labCoat; // we now set the constuctor with the correct values for scientist
		this.typeScientist = typeScientist; 
	}

public String typeScientistByCoat() { //This method creates a condition to determine the type of Scientist based on the color of the lab coat
	// if the color of the lab coat is green or which ever colour the type of Scientist will be boilogist or which ever color matches the correct field scientist
		if (labCoat == "Green") {
			return	typeScientist += "Biologist";
		} else if (labCoat == "Purple") {
			return	typeScientist += "Physicist";
			
		}else if (labCoat == "White") {
			return	typeScientist += "Pharmacist";
			
		}else if (labCoat == "Blue") {
			return	typeScientist += "Climatologist";
			
		}else if (labCoat == "Yellow") {
			return	typeScientist += "Geneticist";
			
		}else if (labCoat == "Red") {
			return	typeScientist += "Zoologist";
			
		}
		return typeScientist;
		 
	}
//we now call our created objects in out to String method, it will out put them each in the below sequence 
public String toString() {
	 String output = "Scientist's height is: " + height + " feet tall \n";
	 output += "The Scientist's Hair colour is: " + hairColour + "\n";
	 output += "Is this Scientist over 18: " + over18 + "\n";
	 output += "The Scientists Lab coat colour is: " + labCoat + "\n";
	 output += "So this makes this Scientist a:" + typeScientistByCoat();// here we are calling the method for the type of sceintist
	
	 return output;
}


public static void main(String[] args) {
	Scientist Scientister = new Scientist("Blue", " " , 7, "Blonde", false); // we create a new Scientist with new attributes and we leave an empty string to determine the type of scientist based on the color
	
	  System.out.println( Scientister); // We now print out the new scientist person with his attributes 
 }
}

//reference :
//all references are on the main person class  Person.java