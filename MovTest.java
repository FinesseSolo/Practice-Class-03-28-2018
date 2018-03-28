import java.util.Scanner;
public class MovTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);

Mov Movie1 = new Mov ("Jaws", "Horror", "R");
Mov Movie2 = new Mov ("Saw", "Horror", "R");
Mov Movie3 = new Mov ("Cars", "Childrens", "PG");
Mov Movie4 = new Mov ("Forest Gump","Drama","PG13");
Mov Movie5 = new Mov ("GodFather","Crime", "R");
 Mov[]movie ={Movie1,Movie2,Movie3,Movie4,Movie5};

System.out.println("Please enter info");
String Name = scanner.nextLine();




for (int i = 0; i <5; i++) {
if(Name.equals(movie[i].Name)){
System.out.println(movie[i].Name);
System.out.println(movie[i].Genre);
System.out.println(movie[i].Rating);
}else System.out.println ("Not found");
	}
	}
}
