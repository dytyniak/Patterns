package ChainOfResponsibility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HouseProject {
	private final Set<Steps> steps = new HashSet<>();

	public HouseProject(Steps... steps) {
		this.steps.addAll(Arrays.asList(steps));
	}

	public enum Steps {
		CREATE_BASEMENT, ADD_FLOOR, CREATE_ROOF, BUILD_FENCE
	}

	public Set<Steps> getSteps() {
		return steps;
	}
}
