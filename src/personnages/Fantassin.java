package personnages;
import observateurs.Organisation;
import comportements.ComportementAPiedAvecHache;
import comportements.ComportementParler;


public class Fantassin extends Personnage {

	public Fantassin(Organisation unEtatMajor, String unNom) {
		super(unEtatMajor, unNom);
		setComportementCombat(new ComportementAPiedAvecHache());
		setComportementEmettreUnSon(new ComportementParler());
		getEtatMajor().attach(this);
	}
	
	@Override
	public String afficher() {
		return super.afficher() + " le fantassin";
	}

	@Override
	public void update() {
		setEtatFonctionnement(getEtatMajor().getModeFonctionnement());
	}
}
