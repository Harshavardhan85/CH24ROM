class ProjectorRunner{
 public static void main(String[] args) {

Projector projector1 = new Projector();
        Projector projector2 = new Projector("Epson", "Laser", "White", 3.0);
        Projector projector3 = new Projector();
        projector3.setCompany("BenQ");
        projector3.setType("LCD");
        projector3.setColor("Gray");
        projector3.setWeight(2.0);
		
		System.out.println("\nChocolate Objects:");
        
		chocolate1.printInfo();
		chocolate2.printInfo();
		chocolate3.printInfo();
 }
}