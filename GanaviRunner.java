class GanaviRunner {


    public static void main(String[] args) {
        // Create a clip
        Clip myClip = new Clip("Red", "Binder");

        // Create a Ganavi object
        Ganavi ganavi = new Ganavi("ganavi@example.com", myClip);

        // Display details of the Ganavi object
        ganavi.details();
    }
}