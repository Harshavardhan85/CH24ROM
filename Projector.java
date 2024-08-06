class Projector {
    String company;
    String type;
    String color;
    double weight;

   
    public Projector() {
        this.company = "Unknown";
        this.type = "Unknown";
        this.color = "Unknown";
        this.weight = 0.0;
    }

   
    public Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    
    public void setCompany(String company)
	{
		this.company = company; 
	}
    public void setType(String type) 
	{ 
	this.type = type; 
	}
    public void setColor(String color) 
	{ 
	this.color = color;
	}
    public void setWeight(double weight)
	{ 
	this.weight = weight; 
	}

    
    {
        this.company = "Optoma";
        this.type = "LED";
        this.color = "Black";
        this.weight = 2.5;
    }

   
    public void printInfo() {
        System.out.println("Projector [Company=" + company + ", Type=" + type + ", Color=" + color + ", Weight=" + weight + "]");
    }
}