package Facade;

public class Main {
	
	public static void main(String[] args) {
		SkiResortFacade skiResortFacade = new SkiResortFacade();
		
		System.out.println(skiResortFacade.HaveRestWithOwnSkis());
		
		System.out.println(skiResortFacade.HaveGoodRest(180, 85, 41, 2, 3));
	}
	
}
