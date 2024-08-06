class Paper {
    double thickness;
    String size;
    String quality;
    String color;

    
    public Paper() {
        this.thickness = 0.0;
        this.size = "Unknown";
        this.quality = "Unknown";
        this.color = "Unknown";
    }

    
    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

   
    public void setThickness(double thickness)
	{ 
	this.thickness = thickness;
	}
    public void setSize(String size) 
	{ 
	this.size = size;
	}
    public void setQuality(String quality)
	{ 
	this.quality = quality;
	}
    public void setColor(String color)
	{ 
	this.color = color; 
	}

   
    {
        this.thickness = 0.1;
        this.size = "A4";
        this.quality = "High";
        this.color = "White";
    }

  
    public void printInfo() {
        System.out.println("Paper [Thickness=" + thickness + ", Size=" + size + ", Quality=" + quality + ", Color=" + color + "]");
    }
}