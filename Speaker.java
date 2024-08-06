class Speaker{
	
    String brand;
    String size;
    double cost;
    String output;

   
    public Speaker() {
        this.brand = "Unknown";
        this.size = "Unknown";
        this.cost = 0.0;
        this.output = "Unknown";
    }

   
    public Speaker(String brand, String size, double cost, String output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    
    public void setBrand(String brand)
	{ 
	this.brand = brand; 
	}
    public void setSize(String size)
	{ 
	this.size = size; 
	}
    public void setCost(double cost)
	{
		this.cost = cost; 
	}
    public void setOutput(String output)
	{ 
	this.output = output;
	}

  
    {
        this.brand = "DefaultBrand";
        this.size = "DefaultSize";
        this.cost = 100.0;
        this.output = "Stereo";
    }

   
    public void printInfo() {
        System.out.println("Speaker [Brand=" + brand + ", Size=" + size + ", Cost=" + cost + ", Output=" + output + "]");
    }
}