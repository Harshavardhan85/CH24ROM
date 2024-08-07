class CapitalCity {

     String cityName;
     String countryName;
     long population; 

    public CapitalCity(String cityName, String countryName, long population) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.population = population;
    }

    public void printDetails() {
        System.out.println("City Name: " + cityName);
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population + " million");
    }
}