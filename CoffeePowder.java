class CoffeePowder {

     double cost;
     String company;
     double weight;
     Date manfDate;

    public CoffeePowder() {
        this.cost = 0.0;
        this.company = "";
        this.weight = 0.0;
        this.manfDate = new Date();
    }

    public CoffeePowder(String company) {
        this.company = company;
        this.cost = 0.0;
        this.weight = 0.0;
        this.manfDate = new Date();
    }

    public CoffeePowder(String company, double cost, double weight, Date manfDate) {
        this.company = company;
        this.cost = cost;
        this.weight = weight;
        this.manfDate = manfDate;
    }

    public CoffeePowder(String company, Date manfDate) {
        this.company = company;
        this.cost = 0.0;
        this.weight = 0.0;
        this.manfDate = manfDate;
    }

    public CoffeePowder(double weight) {
        this.company = "";
        this.cost = 0.0;
        this.weight = weight;
        this.manfDate = new Date();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getManfDate() {
        return manfDate;
    }

    public void setManfDate(Date manfDate) {
        this.manfDate = manfDate;
    }
}
    