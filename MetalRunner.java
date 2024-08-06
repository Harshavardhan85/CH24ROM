class MetalRunner{

public static void main(String[] args) {

        // Test no-argument constructor
        Metal metal1 = new Metal();
        System.out.println("Metal1 - Name: " + metal1.getName() + ", Cost: " + metal1.getCost());

        // Test constructor to initialize name
        Metal metal2 = new Metal("Gold");
        System.out.println("Metal2 - Name: " + metal2.getName() + ", Cost: " + metal2.getCost());

        // Test constructor to initialize cost
        Metal metal3 = new Metal(500.0);
        System.out.println("Metal3 - Name: " + metal3.getName() + ", Cost: " + metal3.getCost());

        // Test constructor to initialize both name and cost
        Metal metal4 = new Metal("Silver", 300.0);
        System.out.println("Metal4 - Name: " + metal4.getName() + ", Cost: " + metal4.getCost());
    }
}


