package personnages;
import observateurs.Organisation;

import comportements.ComportementAvecArc;
import comportements.ComportementParler;


public class Archer extends Personnage {
	
	public Archer(Organisation unEtatMajor, String unNom) {
		super(unEtatMajor, unNom);
		setComportementCombat(new ComportementAvecArc());
		setComportementEmettreUnSon(new ComportementParler());
		getEtatMajor().attach(this);
	}
	
	@Override
	public String afficher() {
		return super.afficher() + " l'archer";
	}
	
	@Override
	public String seDeplacer() {
		return super.seDeplacer();
	}

	@Override
	public void update() {
		setEtatFonctionnement(getEtatMajor().getModeFonctionnement());
	}
}
