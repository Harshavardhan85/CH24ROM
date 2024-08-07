class AnanyaRunner {

 
    public static void main(String[] args) {
		
        Knife myKnife = new Knife(150.0, 25.0);

        Ananya ananya = new Ananya("9875215853", myKnife);

        ananya.details();
    }
}