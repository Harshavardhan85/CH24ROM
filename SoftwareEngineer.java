class SoftwareEngineer {

    private String name;
    private int experience; // in years
    private String designation;
    private double salary; // in dollars

    public SoftwareEngineer(String name, int experience, String designation, double salary) {
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
    }
	
	
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }
}	