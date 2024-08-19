class GiantWheelRunner {
	public static void main(String[] args){

	 // Create instances of GiantWheel
        GiantWheel[] giantWheels = new GiantWheel[3];
        giantWheels[0] = new GiantWheel("Ferris Wheel", 40, 50.0);
        giantWheels[1] = new GiantWheel("Sky Eye", 100, 120.0);
        giantWheels[2] = new GiantWheel("Wonder Wheel", 60, 45.0);
		
         for (GiantWheel giantWheel : giantWheels) {
            giantWheel.display();
        }
	}
}	