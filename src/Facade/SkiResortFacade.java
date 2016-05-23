package Facade;

class SkiResortFacade {

	private SkiRent skiRent = new SkiRent();
	private SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
	private HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

	// Беручи до уваги вхідні параметри, бронює номер, підбирає лижі і т.д
	// Повертає загальну ціну за все
	public int HaveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality) {
		int skiPrice = skiRent.rentSki(weight, skierLevel);
		int skiBootsPrice = skiRent.rentBoots(feetSize, skierLevel);
		int polePrice = skiRent.rentPole(height);
		int oneDayTicketPr = skiResortTicketSystem.buyOneDayTicket();
		int hotelPrice = hotelBookingSystem.BookRoom(roomQuality);
		return skiPrice + skiBootsPrice + polePrice + oneDayTicketPr + hotelPrice;
	}

	// Інші методи можуть поєднувати виклики до інших систем
	public int HaveRestWithOwnSkis() {
		int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
		return oneDayTicketPrice;
	}
	// Може бути, що наш Фасад-Термінал просто огортає методи з усіх систем
}