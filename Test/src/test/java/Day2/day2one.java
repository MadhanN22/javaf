package Day2;

public class day2one {
	
	private String firstName;
    private String lastName;
    private char gender;
    
    public day2one() {
        firstName = "";
        lastName = "";
        gender = 'U';
    }
    public day2one(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
    }

	public static void main(String[] args) {
	
		
		day2one p1 = new day2one("Divya", "Bharathi", 'F');

	        
	        p1.displayDetails();
		
		
		
		

	}

}
