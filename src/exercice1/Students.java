package exercice1;

import java.util.Scanner;

public class Students {

	private String [] LastName;
	private String [] FirstName;
	private int [] Age;
	private int Max=10;
	
	public Students() {
		this.LastName= new String[this.Max];
		this.FirstName= new String[this.Max];
		this.Age= new int[this.Max];
	}
	
	public Students(String [] LastName, String [] FirstName, int [] Age) {
		this.LastName= new String[this.Max];
		this.FirstName= new String[this.Max];
		this.Age= new int[this.Max];
		for(int i=0;i<this.Max;i++) {
			this.LastName[i]=LastName[i];
			this.FirstName[i]=FirstName[i];
			this.Age[i]=Age[i];
		}
	}
	
	public Students(Students Grp) {
		for(int i=0;i<this.Max;i++) {
			this.LastName[i]=Grp.LastName[i];
			this.FirstName[i]=Grp.FirstName[i];
			this.Age[i]=Grp.Age[i];
		}
	}
	
	public String[] getLastName() {
		return LastName;
	}

	public void setLastName(String[] lastName) {
		LastName = lastName;
	}

	public String[] getFirstName() {
		return FirstName;
	}

	public void setFirstName(String[] firstName) {
		FirstName = firstName;
	}

	public int[] getAge() {
		return Age;
	}

	public void setAge(int[] age) {
		Age = age;
	}
	
	public String search(String Name) {
		for(int i=0;i<this.Max;i++) {
			if(Name.equals(this.LastName[i])) {
				return "L'étudiant a été trouvé. Il s'agit de "+this.LastName[i]+" "+this.FirstName[i]+", "+this.Age[i]+" ans.";
			}
		}
		return "L'étudiant n'a pas été trouvé.";
	}
	
	public double averageAge(int [] Age) {
		double AverageAge=0;
		for(int i=0;i<this.Max;i++) {
			AverageAge=AverageAge+Age[i];
		}
		AverageAge=AverageAge/this.Max;
		return AverageAge;
	}
	
	public String givenAge(int Age) {
		boolean WithGivenAge=false;
		for(int i=0;i<this.Max;i++) {
			if(this.Age[i]==Age) {
				System.out.println(this.LastName[i]+" "+this.FirstName[i]);
				WithGivenAge=true;
			}
		}
		if(WithGivenAge==false) {
			return "null";
		}
		else {
			return "Tous les étudiants ont été trouvés";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer=0;
		String Name;
		int Age;
		String Réponse;
		Scanner sc = new Scanner(System.in);
		
		Students Class1 = new Students();
		
		Class1.Age[0]=20;
		Class1.Age[1]=18;
		Class1.Age[2]=17;
		Class1.Age[3]=16;
		Class1.Age[4]=20;
		Class1.Age[5]=21;
		Class1.Age[6]=22;
		Class1.Age[7]=19;
		Class1.Age[8]=19;
		Class1.Age[9]=18;
		
		Class1.LastName[0]="Nom1";
		Class1.LastName[1]="Nom2";
		Class1.LastName[2]="Nom3";
		Class1.LastName[3]="Nom3";
		Class1.LastName[4]="Nom4";
		Class1.LastName[5]="Nom5";
		Class1.LastName[6]="Nom6";
		Class1.LastName[7]="Nom7";
		Class1.LastName[8]="Nom8";
		Class1.LastName[9]="Nom9";
		
		Class1.FirstName[0]="Prénom1";
		Class1.FirstName[1]="Prénom2";
		Class1.FirstName[2]="Prénom3";
		Class1.FirstName[3]="Prénom3";
		Class1.FirstName[4]="Prénom4";
		Class1.FirstName[5]="Prénom5";
		Class1.FirstName[6]="Prénom6";
		Class1.FirstName[7]="Prénom7";
		Class1.FirstName[8]="Prénom8";
		Class1.FirstName[9]="Prénom9";
		
		
		System.out.println("Bienvenue dans ce programme de gestion d'une liste d'étudiants.");
		System.out.println("Que souhaitez-vous faire ?");
		System.out.println("1 : Trouver un étudiant à partir de son nom");
		System.out.println("2 : Calculer la moyenne d'âge des étudiants");
		System.out.println("3 : Trouver les étudiants qui ont un âge donné");
		System.out.println("4 : Quitter");
		
		while(answer != 4) {
		
			answer=sc.nextInt();
			
			switch(answer) {
			case 1:
				sc.nextLine();
				System.out.println("Veuillez saisir le nom de l'étudiant que vous recherchez.");
				Name=sc.nextLine();
				Réponse=Class1.search(Name);
				System.out.println(Réponse);
				System.out.println("Souhaitez-vous faire autre chose ?");
				System.out.println("1 : Trouver un étudiant à partir de son nom");
				System.out.println("2 : Calculer la moyenne d'âge des étudiants");
				System.out.println("3 : Trouver les étudiants qui ont un âge donné");
				System.out.println("4 : Quitter");
				break;
				
			case 2:
				System.out.println("Calcul de la moyenne d'âge en cours...");
				System.out.println("La moyenne d'âge est de : "+Class1.averageAge(Class1.Age)+" ans.");
				System.out.println("Souhaitez-vous faire autre chose ?");
				System.out.println("1 : Trouver un étudiant à partir de son nom");
				System.out.println("2 : Calculer la moyenne d'âge des étudiants");
				System.out.println("3 : Trouver les étudiants qui ont un âge donné");
				System.out.println("4 : Quitter");
				break;
				
			case 3:
				System.out.println("Entrez l'âge recherché :");
				Age=sc.nextInt();
				Réponse=Class1.givenAge(Age);
				System.out.println(Réponse);
				System.out.println("Souhaitez-vous faire autre chose ?");
				System.out.println("1 : Trouver un étudiant à partir de son nom");
				System.out.println("2 : Calculer la moyenne d'âge des étudiants");
				System.out.println("3 : Trouver les étudiants qui ont un âge donné");
				System.out.println("4 : Quitter");
				break;
			
			case 4:
				System.out.println("Fin.");
				break;
				
			default:
				System.out.println(answer+" n'est pas une réponse valide.");
			}
		}
		sc.close();
	}

}

