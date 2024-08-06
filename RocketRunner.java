class RocketRunner{

public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        Rocket rocket2 = new Rocket("Russia", 6000.0, 12000.0, 6);
        Rocket rocket3 = new Rocket();
        rocket3.setCountry("China");
        rocket3.setSpeed(7000.0);
        rocket3.setFuelCapacity(15000.0);
        rocket3.setNoOfThrusters(5);
		
		System.out.println("\nRocket Objects:");
        rocket1.printInfo();
        rocket2.printInfo();
        rocket3.printInfo();
		
}
}