package observateurs;


public class Organisation extends SujetObserveAbstrait {

	private eMode modeFonctionnement;
	private Organisation parent;
	
	public Organisation() {
		
	}
	
	public Organisation(Organisation unParent) {
		parent = unParent;
	}

	public eMode getModeFonctionnement() {
		return modeFonctionnement;
	}

	public void setModeFonctionnement(eMode modeFonctionnement) {
		this.modeFonctionnement = modeFonctionnement;
	}

	public Organisation getParent() {
		return parent;
	}

	public void setParent(Organisation parent) {
		this.parent = parent;
	}
}
