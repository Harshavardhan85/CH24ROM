class Key {

     double WEIGHT;
     String BRAND;

	
    public Item(double weight, String brand) {
        this.WEIGHT = weight;
        this.BRAND = brand;
    }
	
    public void details() {
        System.out.println("Weight: " + WEIGHT + " kg");
        System.out.println("Brand: " + BRAND);
    }
}