package Composite;

public class Node implements INode {

	@Override
	public void print(int depth) {
		System.out.println(new String(new char[depth]).replace("\0", "-") + "I am Node.");
	}

}
