package Iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Army army = new Army();

		Team team = new Team();
		Team team2 = new Team();

		Soldier dytyniak = new Soldier("Dytyniak", 80);
		Soldier smith = new Soldier("Smith", 50);
		Soldier black = new Soldier("Black", 79);
		Soldier dytyniak2 = new Soldier("Dytyniak 2", 97);

		team.addSoldier(dytyniak);
		team.addSoldier(dytyniak2);
		team2.addSoldier(smith);
		team2.addSoldier(black);

		army.setTeams(Arrays.asList(team, team2));
		Iterator<Soldier> it = army.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
