package com.xworkz.bikesweetcityriverdam;

public class InfoClasses {

    public class Bike
    {
    private String bikeBrand;
    String[] bikearr = new String[7];
    int index=0;

    public void bikeBrands(String brand)
    {
            this.bikeBrand = brand;
            bikearr[index] = this.bikeBrand;
            index++;
    }
    public void bikeInfo()
    {
        for(String ref1:bikearr)
        {
            System.out.println("brand name is: "+ref1);
        }
    }
    }

    public class Sweet {
        private String sweet;
        String[] sweetArray = new String[7];
        int index;

        public void sweetName(String sweet) {
            this.sweet = sweet;
            sweetArray[index] = sweet;
            index++;
        }

        public void sweetInfo() {
            for (String ref : sweetArray) {
                System.out.println("Sweet name is: " + ref);
            }
        }
    }

    public class City{

        private String cityname;
        String[] cityArray = new String[7];
        int start;
        public void storeCityName(String cityname)
        {
            this.cityname = cityname;
            cityArray[start]= cityname;
            start++;
        }

        public void cityInfo()
        {
            for(String cityref: cityArray)
            {
                System.out.println("city name is: "+cityref);
            }
        }
    }

    public class River{

        private String riverName;
        String[] riverArray = new String[7];
        int position = 0;

        public void storeRiverNames(String riverName)
        {
            this.riverName = riverName;
            riverArray[position]= riverName;
            position++;
        }
        public void riverInfo()
        {
            for(String riverRef: riverArray)
            {
                System.out.println("River Name is: "+riverRef);

            }
        }
    }
    class Dam
    {
        private String damName;
        String[] damArray = new String[7];
        int start;

        void storeDams(String damName)
        {
            this.damName = damName;
            damArray[start] = damName;
            start++;
        }

        void damInfo()
        {
            for(String damref : damArray)
            {
                System.out.println("Dam Name: "+damref);

            }
        }
    }
}


