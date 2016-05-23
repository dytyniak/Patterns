package Composite;

public class Main {

	public static void main(String[] args) {
		// Initialize four nodes
		INode node1 = new Node();
		INode node2 = new Node();
		INode node3 = new Node();

		// Initialize three composite nodes
		CompositeNode compositeNode = new CompositeNode();
		CompositeNode compositeNode2 = new CompositeNode();
		CompositeNode compositeNode3 = new CompositeNode();
		
		//Composes the nodes
		compositeNode2.addChild(node1);
		compositeNode2.addChild(node2);
		compositeNode2.addChild(node3);

		compositeNode3.addChild(node1);

		compositeNode.addChild(compositeNode2);
		compositeNode.addChild(compositeNode3);

        //Prints the complete node (four times the string "I am Node.").
		compositeNode.print(0);
	}

}
