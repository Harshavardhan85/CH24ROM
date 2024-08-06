class PaperRunner{
public static void main(String[] args) {


        Paper paper1 = new Paper();
        Paper paper2 = new Paper(0.2, "A3", "Medium", "Blue");
        Paper paper3 = new Paper();
        paper3.setThickness(0.3);
        paper3.setSize("Letter");
        paper3.setQuality("High");
        paper3.setColor("Green");
		
		System.out.println("\nPaper Objects:");
        
		Paper1.printInfo();
		Paper2.printInfo();
		Paper3.printInfo();
}
} 