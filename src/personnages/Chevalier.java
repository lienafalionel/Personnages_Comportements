package personnages;
import observateurs.Organisation;
import comportements.ComportementACheval;
import comportements.ComportementCrier;


public class Chevalier extends Personnage {

	public Chevalier(Organisation unEtatMajor, String unNom) {
		super(unEtatMajor, unNom);
		setComportementCombat(new ComportementACheval());
		setComportementEmettreUnSon(new ComportementCrier());
		getEtatMajor().attach(this);
	}

	@Override
	public String afficher() {
		return super.afficher() + " le chevalier";
	}

	@Override
	public void update() {
		setEtatFonctionnement(getEtatMajor().getModeFonctionnement());
	}
}
