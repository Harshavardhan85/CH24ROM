class SpeakerRunner {
    public static void main(String[] args) {
        
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker("JBL", "Medium", 150.0, "Surround");
        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Sony");
        speaker3.setSize("Large");
        speaker3.setCost(200.0);
        speaker3.setOutput("5.1");
		
		System.out.println("Speaker Objects:");
        speaker1.printInfo();
        speaker2.printInfo();
        speaker3.printInfo();
		}
}		
		