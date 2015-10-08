package observateurs;
import java.util.ArrayList;
import java.util.List;


public abstract class SujetObserveAbstrait {

	private List<ObservateurAbstrait> observateurList = new ArrayList<ObservateurAbstrait>();
	
	public void attach(ObservateurAbstrait unObservateur) {
		observateurList.add(unObservateur);
	}
	
	public void deAttach(ObservateurAbstrait unObservateur) {
		observateurList.remove(unObservateur);
	}

	public void update() {
		for (ObservateurAbstrait observateurAbstrait : observateurList) {
			observateurAbstrait.update();
		}
	}
	
	public List<ObservateurAbstrait> getObservateurList() {
		return observateurList;
	}

	public void setObservateurList(List<ObservateurAbstrait> observateurList) {
		this.observateurList = observateurList;
	}
	
}
