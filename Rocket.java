class Rocket {
    String country;
    double speed;
    double fuelCapacity;
    int noOfThrusters;

    
    public Rocket() {
        this.country = "Unknown";
        this.speed = 0.0;
        this.fuelCapacity = 0.0;
        this.noOfThrusters = 0;
    }

    
    public Rocket(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

   
    public void setCountry(String country) 
	{
		this.country = country; 
		}
    public void setSpeed(double speed) 
	{ 
	this.speed = speed; 
	}
    public void setFuelCapacity(double fuelCapacity)
	{ 
	this.fuelCapacity = fuelCapacity; 
	}
    public void setNoOfThrusters(int noOfThrusters)
	{ 
	this.noOfThrusters = noOfThrusters; 
	}

   
    {
        this.country = "USA";
        this.speed = 5000.0;
        this.fuelCapacity = 10000.0;
        this.noOfThrusters = 4;
    }

   
    public void printInfo() {
        System.out.println("Rocket [Country=" + country + ", Speed=" + speed + ", FuelCapacity=" + fuelCapacity + ", NoOfThrusters=" + noOfThrusters + "]");
    }
}