package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army implements Iterable<Soldier> {

	private List<Team> teams = new ArrayList<>();

	public List<Team> getTeams() {
		return teams;
	}
	
	public void hill(){
		Iterator<Soldier> it = this.iterator();
		while (it.hasNext()) {
			it.next().hill();
		}
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public Iterator<Soldier> iterator() {
		return new Iterator<Soldier>() {

			private int teamPointer = 0;
			private int soldierPointer = 0;

			@Override
			public boolean hasNext() {
				if (teams.size() != teamPointer) {
					return true;
				}
				return false;
			}

			@Override
			public Soldier next() {
				Soldier soldier = teams.get(teamPointer).getSoldier(soldierPointer);

				if (teams.get(teamPointer).size() - 1 == soldierPointer) {
					teamPointer++;
					soldierPointer = 0;
				} else {
					soldierPointer++;
				}

				return soldier;
			}

		};
	}

}
