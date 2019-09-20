
public class Register {
	String name;
	String age;
	String degree;
	String branch;
	String contactNumber;
	
	public Register(String name, String age, String degree, String branch, String contactNumber) {
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.branch = branch;
		this.contactNumber = contactNumber;
	}
    public void register(String name, String age, String degree, String branch, String contactNumber ) {
    	
    	System.out.println("Name: "+name);
    	System.out.println("Age: "+age);
    	System.out.println("Degree: "+degree);
    	System.out.println("Branch: "+branch);
    	System.out.println("Contact Number: "+contactNumber);
    }
}
