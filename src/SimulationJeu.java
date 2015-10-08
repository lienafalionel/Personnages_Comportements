import java.util.ArrayList;
import java.util.List;

import observateurs.Organisation;
import observateurs.eMode;
import personnages.Archer;
import personnages.Chevalier;
import personnages.Fantassin;
import personnages.Personnage;
import personnages.Princesse;

public class SimulationJeu {

	private List<Personnage> personnages;
	private Organisation etatMajor;

	public SimulationJeu() {
		personnages = new ArrayList<Personnage>();
		etatMajor = new Organisation();
		creationPersonnages();
	}

	public String afficheTous() {
		String text = "";
		for (Personnage personnage : personnages) {
			text += "- " + personnage.afficher() + "\n";
		}
		return text;
	}
	
	public void ajouterALaSimulation(Personnage... lesPersonnages) {
		for (Personnage personnage : lesPersonnages) {
			personnages.add(personnage);
		}
	}

	public void changerComportement() {
		
	}

	public void creationPersonnages() {
		Personnage archer = new Archer(etatMajor, "Archer");
		Personnage chevalier = new Chevalier(etatMajor, "Chevalier");
		Personnage fantassin = new Fantassin(etatMajor, "Fantassin");
		Personnage princesse = new Princesse("Princesse");

		personnages.add(archer);
		personnages.add(chevalier);
		personnages.add(fantassin);
		personnages.add(princesse);
	}

	public String emettreSonTous() {
		String text = "";
		for (Personnage personnage : personnages) {
			text += "- " + personnage.emettreUnSon() + "\n";
		}
		return text;
	}
	
	public void envoyerOrdreGuerre() {
		etatMajor.setModeFonctionnement(eMode.Guerre);
	}
	
	public void envoyerOrdrePaix() {
		etatMajor.setModeFonctionnement(eMode.Paix);
	}

	public String lancerCombat() {
		String text = "Combat : \n";
		for (Personnage personnage : personnages) {
			if (personnage.getComportementCombat() != null) {
				text += "- " + personnage.combattre() + "\n";
			}
		}
		return text;
	}
}
