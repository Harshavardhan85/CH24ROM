public class Metal {
    
     String name;
     double cost;

    public Metal() {
        this.name = "";
        this.cost = 0.0;
    }

    public Metal(String name) {
        this.name = name;
        this.cost = 0.0;
    }

    public Metal(double cost) {
        this.name = "";
        this.cost = cost;
    }

    public Metal(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    
    public void setCost(double cost) {
        this.cost = cost;
    }
}