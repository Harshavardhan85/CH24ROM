class PerfumeRunner{

    public static void main(String[] args) {
		
        Perfume perfume1 = new Perfume();
        System.out.println("Perfume1 - Brand: " + perfume1.getBrand() + ", Price: " + perfume1.getPrice() +
                           ", Quantity: " + perfume1.getQuantity() + ", Cost: " + perfume1.getCost());

        Perfume perfume2 = new Perfume("Chanel", 120.0);
        System.out.println("Perfume2 - Brand: " + perfume2.getBrand() + ", Price: " + perfume2.getPrice() +
                           ", Quantity: " + perfume2.getQuantity() + ", Cost: " + perfume2.getCost());

        Perfume perfume3 = new Perfume("Dior", 150.0, 10);
        System.out.println("Perfume3 - Brand: " + perfume3.getBrand() + ", Price: " + perfume3.getPrice() +
                           ", Quantity: " + perfume3.getQuantity() + ", Cost: " + perfume3.getCost());

        Perfume perfume4 = new Perfume("Versace", 200.0, 5, 180.0);
        System.out.println("Perfume4 - Brand: " + perfume4.getBrand() + ", Price: " + perfume4.getPrice() +
                           ", Quantity: " + perfume4.getQuantity() + ", Cost: " + perfume4.getCost());
    }
}