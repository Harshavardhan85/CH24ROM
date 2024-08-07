class Company {

    private int id;
    private String name;
    private String location;

    public Company(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void printDetails() {
        System.out.println("Company ID: " + id);
        System.out.println("Company Name: " + name);
        System.out.println("Location: " + location);
    }

class SoftwareEngineer {

    private String name;
    private int experience; 
    private String designation;
    private double salary; 
    private Company company; 

    public SoftwareEngineer(String name, int experience, String designation, double salary, Company company) {
        this.name = name;
        this.experience = experience;
        this.designation = designation;
        this.salary = salary;
        this.company = company;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Details:");
        company.printDetails();
    }
}