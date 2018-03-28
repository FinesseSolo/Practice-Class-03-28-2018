import java.util.Scanner;
public class dogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter information");
		dog[]dogs = new dog [3];
		for(int i = 0; i < 3; i ++){
		String Name = scanner.nextLine();
		String Breed = scanner.nextLine();
		dogs[i]= new dog(Name,Breed);
		}
		
		System.out.println(dogs[1].Name);
		System.out.println(dogs[1].Breed);
	}

}
