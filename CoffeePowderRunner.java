class CoffeePowderRunner{

    public static void main(String[] args) {
		
        CoffeePowder coffee1 = new CoffeePowder();
        System.out.println("Coffee1 - Company: " + coffee1.getCompany() + ", Cost: " + coffee1.getCost() +
                           ", Weight: " + coffee1.getWeight() + ", Manufacturing Date: " + coffee1.getManfDate());

        CoffeePowder coffee2 = new CoffeePowder("Nestle");
        System.out.println("Coffee2 - Company: " + coffee2.getCompany() + ", Cost: " + coffee2.getCost() +
                           ", Weight: " + coffee2.getWeight() + ", Manufacturing Date: " + coffee2.getManfDate());

        CoffeePowder coffee3 = new CoffeePowder("Starbucks", 15.0, 250.0, new Date());
        System.out.println("Coffee3 - Company: " + coffee3.getCompany() + ", Cost: " + coffee3.getCost() +
                           ", Weight: " + coffee3.getWeight() + ", Manufacturing Date: " + coffee3.getManfDate());

        CoffeePowder coffee4 = new CoffeePowder("Lavazza", new Date());
        System.out.println("Coffee4 - Company: " + coffee4.getCompany() + ", Cost: " + coffee4.getCost() +
                           ", Weight: " + coffee4.getWeight() + ", Manufacturing Date: " + coffee4.getManfDate());

        CoffeePowder coffee5 = new CoffeePowder(500.0);
        System.out.println("Coffee5 - Company: " + coffee5.getCompany() + ", Cost: " + coffee5.getCost() +
                           ", Weight: " + coffee5.getWeight() + ", Manufacturing Date: " + coffee5.getManfDate());
    }
}