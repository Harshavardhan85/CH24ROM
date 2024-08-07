class KeyBunch {
    String material;

    public Key(String material) {
        this.material = material;
    }

    public void details() {
        System.out.println("Key Material: " + material);
    }


    public Keybunch() {
        keys = new ArrayList<>();
    }

    public void addKey(Key key) {
        keys.add(key);
    }

    public void details() {
        System.out.println("Keybunch contains the following keys:");
        for (Key key : keys) {
            key.details();
        }
}