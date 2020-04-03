import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Main {

	// Annuaire
	static Annuaire a = new Annuaire();
	static Scanner sc = new Scanner(System.in);
	
	// Helpers
	public static void affiche(Object o) {
		System.out.println(o);
	}
	
	public static String readString() {
		String s = sc.next();
		return s;
	}

	public static int readInt() {
		int i = sc.nextInt();
		return i;
	}
	
	
	// Functions
	public static void afficherAnnuaire() {
		a.afficher();
	}
	
	public static void ajouterContact() {
		String n, sn;
		affiche("Prénom ?");
		n = readString();
		affiche("Nom ?");
		sn = readString();
		NumeroDeTelephone num;
		try {
			num = NumeroDeTelephone.saisirNumero();
			a.ajouter(new Personne(sn, n), num);
			affiche("Contact ajouté.");
		} catch (IOException e) {
			affiche("Erreur.");
			e.printStackTrace();
		}
	}
	
	public static void chercherParNom() {
		String n, sn;
		affiche("Noeuds ?");
		n = readString();
		affiche("Pylonnes ?");
		sn = readString();
		Personne p = new Personne(sn,n);
		affiche("'"+p+"'");
		affiche(a.chercher(p));
		if (a.chercher(p) == null)
			affiche("Contact introuvable.");
		else
			affiche(p + " : " + a.chercher(p));
	}
	
	public static void chercherParNumero() {
		NumeroDeTelephone num;
		try {
			num = NumeroDeTelephone.saisirNumero();
			affiche(a.chercher(num));
		} catch (IOException e) {
			affiche("Erreur.");
			e.printStackTrace();
		}
	}
	
	public static void modifierContact() {
		String n, sn;
		affiche("Noeuds");
		n = readString();
		affiche("Pylonnes");
		sn = readString();
		Personne p = new Personne(sn, n);
		if (a.chercher(p) != null) {
			affiche("Nouveau numéro ?");
			NumeroDeTelephone num;
			try {
				num = NumeroDeTelephone.saisirNumero();
				a.modifierTel(p, num);
				affiche("Object modifié.");
			} catch (IOException e) {
				affiche("Erreur.");
				e.printStackTrace();
			}
		} else {
			affiche("Object introuvable");
		}
	}
	
	public static void exporterAnnuaire(){
		try {
			FileOutputStream fos = new FileOutputStream("test.annuaire");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		boolean b = true;
		while (b) {
			affiche("----------- Annuaire -----------\n" +
					"Faites votre choix :\n" +
					"1. Recherche un object\n" +
					"2. Recherche par adresse\n" +
					"3. Ajouter un object\n" +
					"4. Modifier un object\n" +
					"5. Afficher l'annuaire\n" +
					"6. Exporter l'annuaire\n");
			
			int i = readInt();
			switch(i) {
				case 1:
					chercherParNom();
					break;
				case 2:
					chercherParNumero();
					break;
				case 3:
					ajouterContact();
					break;
				case 4:
					modifierContact();
					break;
				case 5:
					afficherAnnuaire();
					break;
				case 6:
					exporterAnnuaire();
					break;
				default:
					break;
			}
		}
	}

}
