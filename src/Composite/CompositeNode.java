package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements INode {

	private List<INode> elements = new ArrayList<INode>();

	@Override
	public void print(int depth) {
		System.out.println(new String(new char[depth]).replace("\0", "-") + "I am composite Node.");
		for (INode e : elements) {
			e.print(depth + 3);
		}
	}

	public void addChild(INode element) {
		elements.add(element);
	}

	public void removeChild(INode element) {
		elements.remove(element);
	}

}
