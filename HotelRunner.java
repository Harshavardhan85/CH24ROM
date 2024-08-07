class HotelRunner{

    public static void main(String[] args) {
		
        Owner owner = new Owner("Madhu", 20, 'M');

        Hotel hotel = new Hotel("Grand Plaza", owner);

        hotel.printDetails();
    }
}