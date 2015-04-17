package exercice1;

public class Students {

	private String lastname;
	private String firstname;
	private int age;
	
	public Students (String lastname, String firstname, int age){
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

}

