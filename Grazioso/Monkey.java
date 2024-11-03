
public class Monkey extends RescueAnimal {
	
	//Instance variable
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;
	
	
	//Constructor
	public Monkey(String name, String tailLength, String height, String bodyLength, String species, String gender, String age, String weight,
	String acquisitionDate,String acquisitionCountry, String trainingStatus, boolean reserved,
	String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		
	}
	
	//Mutator Methods
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	public void setTailLength(String length) {
		tailLength = length;
	}
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	public void setBodyLength(String tall) {
		bodyLength = tall;
	}
	//Accessor Methods
	public String getSpecies() {
		return species;
	}
	public String getTailLength() {
		return tailLength;
	}
	public String getHeight() {
		return height;
	}
	public String getBodyLength() {
		return bodyLength;
	}

}
