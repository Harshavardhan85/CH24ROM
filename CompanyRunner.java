class CompanyRunner {
    public static void main(String[] args) {
        // Create a Company object
        Company company = new Company(101, "Tech Innovators Inc.", "San Francisco, CA");

        // Create a SoftwareEngineer object with reference to the Company object
        SoftwareEngineer engineer = new SoftwareEngineer("Alice Johnson", 5, "Senior Developer", 85000, company);

        // Print the details of the SoftwareEngineer (including company details)
        engineer.printDetails();
    }
}