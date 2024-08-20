class Submarine {
    // Instance variables
    private String name;
    private String countryOfOrigin;
    private double length;
    private double displacement;
    private int crewSize;
    private String propulsionType;
    private int maxDepth;
    private double speed;
    private boolean isNuclearPowered;
    private int missileCount;

    // Constructor
    public Submarine(String name, String countryOfOrigin, double length, double displacement, int crewSize) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.length = length;
        this.displacement = displacement;
        this.crewSize = crewSize;
    }

    // Methods
    public void setPropulsionType(String propulsionType) { this.propulsionType = propulsionType; }
    public void setMaxDepth(int maxDepth) { this.maxDepth = maxDepth; }
    public void setSpeed(double speed) { this.speed = speed; }
    public void setIsNuclearPowered(boolean isNuclearPowered) { this.isNuclearPowered = isNuclearPowered; }
    public void setMissileCount(int missileCount) { this.missileCount = missileCount; }
    // (add more setter methods)

    public void printDetails() {
        System.out.println("Submarine: " + name + ", Country: " + countryOfOrigin + ", Length: " + length + "m, Displacement: " + displacement + " tons, Crew Size: " + crewSize);
        System.out.println("Propulsion: " + propulsionType + ", Max Depth: " + maxDepth + "m, Speed: " + speed + " knots, Nuclear Powered: " + isNuclearPowered + ", Missiles: " + missileCount);
        // (print more details)
    }
}