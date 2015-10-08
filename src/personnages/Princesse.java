package personnages;
import observateurs.eMode;
import comportements.ComportementParlerPrincesse;


public class Princesse extends Personnage {

	public Princesse(String unNom) {
		super(null, unNom);
		setComportementEmettreUnSon(new ComportementParlerPrincesse());
	}

	@Override
	public void update() {
		setEtatFonctionnement(eMode.Paix);
	}

}
