package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private List<Soldier> soldiers = new ArrayList<>();

	public Soldier getSoldier(int position) {
		if (position >= soldiers.size()) {
			return null;
		}
		return soldiers.get(position);
	}

	public int size() {
		return soldiers.size();
	}

	public void addSoldier(Soldier soldier) {
		soldiers.add(soldier);
	}

	public List<Soldier> getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}

}
