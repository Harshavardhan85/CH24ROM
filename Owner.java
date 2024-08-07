class Owner {
  
    private String name;
    private int age;
    private char gender;

    
    public Owner(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public void printDetails() {
        System.out.println("Owner Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}