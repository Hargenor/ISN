
public class Dames {
	
	public static void enoncerRegles()
	{		
			System.out.println("             Voici les regles :      ");
			System.out.println("   -----------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("     - Dans ce jeu les deux joueurs s'affrontent a l'aide de pions");
           	System.out.println("     - Les pions se déplacent en diagonale, toujours vers l'avant et d'une seule case, et peuvent manger les autres pions en se déplacant par dessus");
           	System.out.println("     - Lorsque une pion arrive a la fin du plateau il devient une Dame");
           	System.out.println("     - Une Dame peut se déplacer de plusieurs cases en diagonales, en avant ou en arrière, et manger plusieurs pions");
           	System.out.println("     - Un joueur a perdu lorsque il ne peut plus se déplacer ou si il n'as plus de pion");
           	System.out.println("                  BON JEU !           ");
           	System.out.println("   ----------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	

	

	public static void main(String[] args) {
		
		int Largeur = 0,Longueur = 0;
		int joueur[][] =  new int[Largeur][Longueur];
		String reponsejoueur;
		System.out.println("Etes vous prêts ? Taper oui pour commencer et non pour voir les règles ");
		reponsejoueur = Isn.readString();
		char rj = reponsejoueur.charAt(0);
		if (rj == 'o')
		{
			System.out.println("C'est parti !");
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("	   0 1 2 3 4 5 6 7");
		System.out.println("        0 | | | | | | | | |");
		System.out.println("        1 | | | | | | | | |");
		System.out.println("        2 | | | | | | | | |");
		System.out.println("        3 | | | | | | | | |");
		System.out.println("        4 | | | | | | | | |");
		System.out.println("        5 | | | | | | | | |");
		System.out.println("        6 | | | | | | | | |");
		System.out.println("        7 | | | | | | | | |");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		}
		else 
		{
			enoncerRegles();
		}
		
		
		

	}

}
