class KeyBunchRunner{

    public static void main(String[] args) {
	
        Key key1 = new Key("Steel");
        Key key2 = new Key("Brass");
        Key key3 = new Key("Aluminum");

        Keybunch keybunch = new Keybunch();
        keybunch.addKey(key1);
        keybunch.addKey(key2);
        keybunch.addKey(key3);

        keybunch.details();
    }
}