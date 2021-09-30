
public class ASUStudent {
	
	private String firstName;
	private String lastName;
	private String address;
	private double gpa = 0.0;
	private int fees = 0;
	
	public ASUStudent(String fName, String lName, String add){
		
		firstName = fName;
		lastName = lName;
		address = add;
		
	}
	
	public void changeAddress(String add) {
		
		address = add;
	
	}
	
	public void setGpa(double gpa) {
		
		this.gpa = gpa;
		
	}
	
	public int payFeesInFull() {
		
		fees = 0;
		return fees;
		
	}
	
	public int addFees(int additionalFee) {
		
		fees += additionalFee;
		return fees;
	}

}
