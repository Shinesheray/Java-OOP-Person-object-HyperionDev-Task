
class Person { // this is the class name person as a public class
	
	// here are the persons Attibutes  we save them as public final to show that they are unchanged values 
	public final int height; 
	public final String hairColour;
	public final boolean over18;
	
	// this is the constructor for the Person attributes 
	public Person (int height, String hairColour, boolean over18) {
			this.height = height; // this is for the persons height
			this.hairColour = hairColour; // this string is the hair color string for the person
			this.over18 = over18; // boolean for if the Person is over 18 or not
			}
}

// references:
// I found an easier method to extend my person file from Alex lee on youtube as my classes kept on giving me an error in this file https://www.youtube.com/watch?v=iV-rrFETXjY&ab_channel=AlexLee
// I also found another example from stack overflow on how to create the external extends classes for this task https://stackoverflow.com/questions/880662/extend-a-java-class-from-one-file-in-another-java-file#:~:text=The%20answer%20is%20to%20create,by%20using%20%22extends%22%20keyword.&text=You%20don't.
// I used the same format from Task 5 of Level 2 to create my constructors and methods 
// I found some references to read and reseach from https://coderanch.com/t/367406/java/extend-class-file
