class SubmarineRunner {
    public static void main(String[] args) {
        

        Submarine submarine1 = new Submarine("Nautilus", "USA", 115, 2800, 110);
        Submarine submarine2 = new Submarine("Kursk", "Russia", 155, 23000, 130);
        Submarine submarine3 = new Submarine("Yuan", "China", 77, 3600, 65);

        // Adding instances to an array
        Object[] objects = {submarine1, submarine2, submarine3 };

        // Looping through the array and invoking the print method
        for (Object obj : objects) {
           
            } else if (obj instanceof Submarine) {
                ((Submarine) obj).printDetails();
            }
            System.out.println();
        }
 }