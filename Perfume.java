class Perfume {

     String brand;
     double cost;
     double price;
     int quantity;

    public Perfume() {
        this.brand = "";
        this.cost = 0.0;
        this.price = 0.0;
        this.quantity = 0;
    }

    public Perfume(String brand, double price) {
        this.brand = brand;
        this.cost = 0.0;
        this.price = price;
        this.quantity = 0;
    }

    public Perfume(String brand, double price, int quantity) {
        this.brand = brand;
        this.cost = 0.0;
        this.price = price;
        this.quantity = quantity;
    }

    public Perfume(String brand, double price, int quantity, double cost) {
        this.brand = brand;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}