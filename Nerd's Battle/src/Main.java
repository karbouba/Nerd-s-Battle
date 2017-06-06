import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Bienvenu dans Nerd's Battle!");
		System.out.println("Quel mode voulez lancer ?");
		System.out.println("	1. 1v1 compétitif");
		System.out.println("	2. 1vIA Campagne");
		System.out.println("	3. 1vPoutch");
		String r ="";
		while(r.equals("")){
			Scanner sc = new Scanner(System.in);
			r = sc.nextLine();
			if(r.equals("1")){
				System.out.println("Mod sélectionné: 1v1 compétitif.");
				//launch1v1();
			}else if(r.equals("2")){
				System.out.println("Mode en dev");
			}else if(r.equals("3")){
				System.out.println("Mod sélectionné: 1vPoutch.");
			}
			else{
				System.out.println("Choisissez un mode valide, 1 ou 2.");
				r="";
			}
		}
	}

}
