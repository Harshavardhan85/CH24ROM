class GiantWheel {
    private String name;
    private int capacity;
    private double height;

    public GiantWheel(String name, int capacity, double height) {
        this.name = name;
        this.capacity = capacity;
        this.height = height;
    }

    public void display() {
        System.out.println("GiantWheel Name: " + name + ", Capacity: " + capacity + " people, Height: " + height + " meters");
    }
}