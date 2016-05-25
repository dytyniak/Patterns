package Mediator;

public class Main {

	public static void main(String[] args) {
		Brain brain = new Brain();
		Ear ear = new Ear(brain);
		
		while(!ear.getSounds().equals("exit")){
			ear.hearSomething();
		}
		
	}
	
}