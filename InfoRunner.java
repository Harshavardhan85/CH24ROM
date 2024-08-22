package com.xworkz.bikesweetcityriverdam;

public class InfoRunner {

    public static void main(String[] args) {
        InfoClasses info = new InfoClasses();
        InfoClasses.Bike info2 = info.new Bike();
        info2.bikeBrands("hgdfjgn");
        info2.bikeBrands("mdbyxjfgu");
        info2.bikeBrands("kgldfjgdj");
        info2.bikeBrands("mtnbfkc");
        info2.bikeBrands("fgfgdklsjg");
        info2.bikeBrands("fjgkldsjg");
        info2.bikeBrands("ndihujxfg");
        info2.bikeInfo();
        System.out.println("+++++++++++++Sweet Details+++++++++++++++++++++++++");
        InfoClasses.Sweet sweetobj = info.new Sweet();
        sweetobj.sweetName("laddo");
        sweetobj.sweetName("sdfgdgdo");
        sweetobj.sweetName("laddfdf");
        sweetobj.sweetName("laddfgdg");
        sweetobj.sweetName("lafgd");
        sweetobj.sweetName("dfgdfgdf");
        sweetobj.sweetName("jsfns");
        sweetobj.sweetInfo();
        System.out.println("+++++++++++++City Details+++++++++++++++++++++++++");
        InfoClasses.City cityobj = info.new City();
        cityobj.storeCityName("Bengaluru");
        cityobj.storeCityName("Halasuru");
        cityobj.storeCityName("Tin Factory");
        cityobj.storeCityName("KrPuram");
        cityobj.storeCityName("Rajajinagar");
        cityobj.storeCityName("Pune");
        cityobj.storeCityName("Mumbai");
        cityobj.cityInfo();

        System.out.println("+++++++++++++River Details+++++++++++++++++++++++++");
        InfoClasses.River riverobj = info.new River();
        riverobj.storeRiverNames("Tawi");
        riverobj.storeRiverNames("Jammuna");
        riverobj.storeRiverNames("Ganga");
        riverobj.storeRiverNames("Waji");
        riverobj.storeRiverNames("Halsun river");
        riverobj.storeRiverNames("Kropal");
        riverobj.storeRiverNames("vulmar");

        riverobj.riverInfo();

        System.out.println("+++++++++++++Dam Details+++++++++++++++++++++++++");

        InfoClasses.Dam damobj = info.new Dam();

        damobj.storeDams("damudar");
        damobj.storeDams("prostam");
        damobj.storeDams("gogoog");
        damobj.storeDams("jaluala");
        damobj.storeDams("kotam");
        damobj.storeDams("gonikal");
        damobj.storeDams("hazelpunk");

        damobj.damInfo();

    }

}
