package exercice1;

public class GroupOfStudent {

	private Students[] students;
	private final String name;
	
	public GroupOfStudent(int size, String name) {
		students = new Students[size];
		this.name=name;
	}
	
	public Students getStudent(String name) {
		if(name==null) {
			return null;
		}
		int i=0;
		while(i<this.students.length) {
			if(this.students[i].equals(name)) {
				return this.students[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
