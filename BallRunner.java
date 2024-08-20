class BallRunner{


    public static void main(String[] args) {


        Ball ball1 = new Ball("Leather", "Brown", 22.0, 0.5, "Nike", "Soccer", true, 150);
        Ball ball2 = new Ball("Rubber", "Orange", 25.0, 0.4, "Adidas", "Basketball", true, 200);
        Ball ball3 = new Ball("Plastic", "White", 15.0, 0.2, "Wilson", "Volleyball", false, 100);

        Object[] objects = {ball1, ball2, ball3,};

        // Looping through the array and invoking the print method
        for (Object obj : objects) {
            
            } 
			else if (obj instanceof Ball) {
                ((Ball) obj).printDetails()
			}
 System.out.println();			
			}
			
}