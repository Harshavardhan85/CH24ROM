class KnifeRunner {

    public static void main(String[] args) {
	
        Knife knife1 = new Knife(150.0, 25.0);
        Knife knife2 = new Knife(200.0, 30.0);
        Knife knife3 = new Knife(100.0, 20.0);

        knife1.details();
        knife2.details();
        knife3.details();
    }
}