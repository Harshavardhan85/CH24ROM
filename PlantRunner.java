class PlantRunner {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Rose", "Flower", 2, 0.5, "Red");
        Plant plant2 = new Plant("Oak", "Tree", 50, 20.0, "Green");
        Plant plant3 = new Plant("Cactus", "Succulent", 10, 1.0, "Green");
		
		Object[] objects = { plant1, plant2, plant3};

        // Looping through the array and invoking the print method
        for (Object obj : objects) {
            if (obj instanceof Plant) {
                ((Plant) obj).printDetails();
			}
		}
		 System.out.println();
	}
}	