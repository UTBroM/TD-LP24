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
	
	public float getAverage(){
		float sum = 0;
		int nbStudents = 0;
		for(int i=0;i<students.length;i++){
			if(students[i]!=null){
				nbStudents++;
				sum+=students[i].getAge();
			}

		}
		if(nbStudents==0){
			return 0;
		}
		return sum/nbStudents;
	}
	
	public boolean addStudent(Students Std){
		for(int i=0;i<students.length;i++){
			if(students[i]==null){
				students[i]=Std;
				return true;
			}
		}
		return false;
	}

	public GroupOfStudent getStudents(int age) {
		int size=0;
		int i=0;
		while(students[i]!=null) {
			if(students[i].getAge()==age) {
				size++;
				i++;
			}
		}
		
		GroupOfStudent group = new GroupOfStudent(size,"Same age");
		i=0;
		while(i<students.length && students[i]!=null) {
			if(students[i].getAge()==age) {
				group.addStudent(students[i]);
				i++;
			}
		}
		return group;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
