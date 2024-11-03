import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    public static Scanner scanner = new Scanner(System.in);
    public static String menuChoice;

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        menuChoice = "0";
        String animalsToPrint;
        while (menuChoice != "q") {
        	displayMenu();
        	switch(menuChoice) { // switch actions menuChoice
            	case "1":
            		intakeNewDog(scanner);
            		break;
            	case "2":
            		intakeNewMonkey(scanner);
            		break;
            	case "3":
            		reserveAnimal(scanner);
            		break;
            	case "4":
            		animalsToPrint = "dogs";
            		printAnimals(animalsToPrint);
            		break;
            	case "5":
            		animalsToPrint = "monkeys";
            		printAnimals(animalsToPrint);
            		break;
            	case "6":
            		animalsToPrint = "available";
            		printAnimals(animalsToPrint);
            		break;
            	case "q":
            		break;
            	default:
            		System.out.println("That is an invalid choice, please choose again: ");
            	
        	}
        } 

    }

    // This method prints the menu options
    public static String displayMenu() {
    	
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
        menuChoice = scanner.next();
        return menuChoice;
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Kumquat", "13", "14", "9", "Capuchin", "female", "2", "9.7", "07-04-1776", "England", "intake", false, "United States");
    	Monkey monkey2 = new Monkey("Grapeseed", "13", "14", "9", "Tamarin", "male", "1", "0.9", "12-15-1997", "United States", "intake", true, "United States");
    	Monkey monkey3 = new Monkey("Lettuce", "13", "14", "9", "Guenon", "female", "3", "9.6", "03-13-1984", "United States", "intake", true, "United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("The dog's name is: " + name + ".");
        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("\n\nWhat gender is the dog\n\n");
        String gender = scanner.nextLine();
        System.out.println("\n\nHow old is the dog?\n\n");
        String age = scanner.nextLine();
        System.out.println("\n\nHow much does the dog weigh?\n\n");
        String weight = scanner.nextLine();
        System.out.println("\n\nWhat is the acquisition date?\n\n");
        String date = scanner.nextLine();
        System.out.println("\n\nWhat is the acquisition country?\n\n");
        String country = scanner.nextLine();
        System.out.println("\n\nWhat is the training status?\n\n");
        String status = scanner.nextLine();
        System.out.println("\n\nIs the dog reserved?\n\n");
        boolean reserved = scanner.nextBoolean();
        System.out.println("\n\nWhat country will the dog be serving in?\n\n");
        String serveCountry = scanner.nextLine();
        		
        dogList.add(new Dog(name, breed, gender, age, weight, date, country,
        		status, reserved, serveCountry));
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) { // validates new monkey
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; //returns to menu
            	}
            	
            }
            System.out.println("\n\nHow long is the monkey's tail?\n\n");
            String tailLength = scanner.nextLine();
            System.out.println("\n\nHow tall is the monkey?\n\n");
            String height = scanner.nextLine();
            System.out.println("\n\nHow long is the monkey's body?\n\n");
            String bodyLength = scanner.nextLine();
            System.out.println("\n\nWhat species is the monkey?");
            System.out.println("[1] Capuchin");
            System.out.println("[2] Guenon");
            System.out.println("[3] Macaque");
            System.out.println("[4] Marmoset");
            System.out.println("[5] Squirrel monkey");
            System.out.println("[6] Tamarin");
            String speciesChoice = scanner.nextLine();
            String species = null;
            switch(speciesChoice) {
            	case "1":
            		species = "Capuchin";
            	case "2":
            		species = "Guenon";
            	case "3":
            		species = "Macaque";
            	case "4":
            		species = "Marmoset";
            	case "5":
            		species = "Squirrel monkey";
            	case "6":
            		species = "Tamarin";
            	default:
            		System.out.println("Invalid choice, please choose a number 1-6: ");
            		speciesChoice = scanner.nextLine();
            }
            
            System.out.println("\n\nWhat gender is the monkey?\n\n");
            String gender = scanner.nextLine();
            System.out.println("\n\nHow old is the monkey?\n\n");
            String age = scanner.nextLine();
            System.out.println("\n\nHow much does the monkey weigh?\n\n");
            String weight = scanner.nextLine();
            System.out.println("\n\nWhat is the acquisition date?\n\n");
            String date = scanner.nextLine();
            System.out.println("\n\nWhat is the acquisition country?\n\n");
            String country = scanner.nextLine();
            System.out.println("\n\nWhat is the training status?\n\n");
            String status = scanner.nextLine();
            System.out.println("\n\nIs the monkey reserved?\n\n");
            boolean reserved = scanner.nextBoolean();
            System.out.println("\n\nWhat country will the monkey be serving in?\n\n");
            String serveCountry = scanner.nextLine();
            		
            monkeyList.add(new Monkey(name, tailLength, height, bodyLength, species, gender, age, weight, date, country,
            		status, reserved, serveCountry));

        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("Enter the needed animal type: ");
            String type = scanner.next();
            if (type.equalsIgnoreCase("monkey")|| type.equalsIgnoreCase("dog")) {
            	System.out.print("Enter the needed service country: ");
            	String serviceCountry = scanner.nextLine();
            	if (type.equalsIgnoreCase("monkey")) {
            		for (int i = 0; i < monkeyList.size(); ++i) {
            			if ((monkeyList.get(i).getReserved() == false) && (monkeyList.get(i).getInServiceLocation() == serviceCountry) && (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in-service"))) {
            				monkeyList.get(i).setReserved(true);
            				System.out.println(monkeyList.get(i).getName() + " in " + monkeyList.get(i).getInServiceLocation() + " has been reserved.");
            				break;
            			}
            		}
            		System.out.println("There are no available monkeys in " + serviceCountry + " at this time.");
            	}
            	else if (type.equalsIgnoreCase("dog")) {
            		for (int j = 0; j < dogList.size(); ++j) {
            			if ((dogList.get(j).getReserved() == false) && (dogList.get(j).getInServiceLocation() == serviceCountry) && (dogList.get(j).getTrainingStatus.equalsIgnoreCase("in-service"))) {
            				dogList.get(j).setReserved(true);
            				System.out.println(dogList.get(j).getName() + " in " + dogList.get(j).getInServiceLocation() + " has been reserved.");
            				break;
            			}
            		}
            		System.out.println("There are no available dogs in " + serviceCountry + " at this time.");
            	}
            }
            else {
            	System.out.println("There are no available " + type + "s at this time.");
            }

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String animalPrint) {
            if (animalPrint.equals("dogs")) {
            	for (int d = 0; d < dogList.size(); ++d) {
            		System.out.println("Name: " + dogList.get(d).getName());
            		System.out.println("Training Status: " + dogList.get(d).getTrainingStatus());
            		System.out.println("Acquisition country: " + dogList.get(d).getAcqusitionCountry());
            		if (dogList.get(d).getReserved() == true) {
            			System.out.println("Reserved");
            		}
            		else if (dogList.get(d).getReserved() == false) {
            			System.out.println("Available");
            		}
            		
            	}
            }
            else if (animalPrint.equals("monkeys") {
            	for (int m = 0; m < monkeyList.size(); ++m)) {
            		System.out.println("Name: " + monkeyList.get(m).getName());
            		System.out.println("Training Status: " + monkeyList.get(m).getTrainingStatus());
            		System.out.println("Acquisition country: " + monkeyList.get(m).getAcqusitionCountry());
            		if (monkeyList.get(m).getReserved() == true) {
            			System.out.println("Reserved");
            			System.out.println("");
            		}
            		else if (monkeyList.get(m).getReserved() == false) {
            			System.out.println("Available");
            			System.out.println("");
            		}
            	}
            }
            else if (animalPrint.equals("available")) {
            	for (int ad = 0; ad < dogList.size(); ++ad) {
            		if (dogList.get(ad).getTrainingStatus.equalsIgnoreCase("in-service")) {
            			if (dogList.get(ad).getReserved == false) {
            				System.out.println("Name: " + dogList.get(ad).getName());
                    		System.out.println("Training Status: " + dogList.get(ad).getTrainingStatus());
                    		System.out.println("Acquisition country: " + dogList.get(ad).getAcqusitionCountry());
                    		System.out.println("");
                    		
            			}
            		}
            	}
            	for (int am = 0; am < monkeyList.size(); ++am) {
            		if (monkeyList.get(am).getTrainingStatus.equalsIgnoreCase("in-service")) {
            			if (monkeyList.get(am).getReserved == false) {
            				System.out.println("Name: " + monkeyList.get(am).getName());
                    		System.out.println("Training Status: " + dogList.get(am).getTrainingStatus());
                    		System.out.println("Acquisition country: " + dogList.get(am).getAcqusitionCountry());
                    		System.out.println("");
            			}
            		}
            	}
            }
        }
}
