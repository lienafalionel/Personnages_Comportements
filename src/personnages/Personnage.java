package personnages;
import observateurs.ObservateurAbstrait;
import observateurs.Organisation;
import observateurs.eMode;
import comportements.ComportementCombat;
import comportements.ComportementEmettreUnSon;


public abstract class Personnage extends ObservateurAbstrait {

	private String nom;
	private ComportementCombat comportementCombat = null;;
	private ComportementEmettreUnSon comportementEmettreUnSon = null;
	private eMode etatFonctionnement = null;
	private Organisation etatMajor = null;
	
	public Personnage(Organisation unEtatMajor, String unNom) {
		etatMajor = unEtatMajor;
		nom = unNom;
	}
	
	public String afficher() {
		return "Je suis " + nom;
	}
	
	public String combattre() {
		return comportementCombat.combattre();
	}
	
	public String emettreUnSon() {
		return comportementEmettreUnSon.emettreUnSon();
	}
	
	public String seDeplacer() {
		return "";
	}
	
	public void modifierComportementCombat(ComportementCombat unComportement) {
		comportementCombat = unComportement;
	}
	
	public void modifierComportementEmttreSon(ComportementEmettreUnSon unComportement) {
		comportementEmettreUnSon = unComportement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ComportementCombat getComportementCombat() {
		return comportementCombat;
	}

	public void setComportementCombat(ComportementCombat comportementCombat) {
		this.comportementCombat = comportementCombat;
	}

	public ComportementEmettreUnSon getComportementEmettreUnSon() {
		return comportementEmettreUnSon;
	}

	public void setComportementEmettreUnSon(ComportementEmettreUnSon comportementEmettreUnSon) {
		this.comportementEmettreUnSon = comportementEmettreUnSon;
	}

	public eMode getEtatFonctionnement() {
		return etatFonctionnement;
	}

	public void setEtatFonctionnement(eMode etatFonctionnement) {
		this.etatFonctionnement = etatFonctionnement;
	}

	public Organisation getEtatMajor() {
		return etatMajor;
	}

	public void setEtatMajor(Organisation etatMajor) {
		this.etatMajor = etatMajor;
	}
}
