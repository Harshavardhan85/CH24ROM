class Plant {
    // Instance variables
    private String name;
    private String type;
    private int age;
    private double height;
    private String color;

    private String location;
    private boolean isFlowering;
    private int waterLevel;
    private String soilType;
    private String season;

	// Constructor
    public Plant(String name, String type, int age, double height, String color) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.height = height;
        this.color = color;
    }

    // Methods
    public void setLocation(String location)
	{ 
	this.location = location;
	}
    public void setIsFlowering(boolean isFlowering) 
	{
	this.isFlowering = isFlowering; 
	}
    public void setWaterLevel(int waterLevel) 
	{ 
	this.waterLevel = waterLevel; 
	}
    public void setSoilType(String soilType)
	{ 
	this.soilType = soilType; 
	}
    public void setSeason(String season) 
	{
		this.season = season; 
	}

    public void printDetails() {
        System.out.println("Plant: " + name + ", Type: " + type + ", Age: " + age + " years, Height: " + height + "m, Color: " + color);
        System.out.println("Location: " + location + ", Flowering: " + isFlowering + ", Water Level: " + waterLevel + ", Soil Type: " + soilType + ", Season: " + season);
    }
}