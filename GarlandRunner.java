class GarlandRunner{
	 public static void main(String[] args) {
// Create instances of Garland
        Garland[] garlands = new Garland[3];
        garlands[0] = new Garland("Red", 5, "Plastic");
        garlands[1] = new Garland("Green", 7, "Fabric");
        garlands[2] = new Garland("Gold", 4, "Paper");
		
		
		for (Garland garland : garlands) {
            garland.display();
        }
	 }
}	 