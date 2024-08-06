class Candle{

double length;
double price;
string fragrance;

Candle(double length){
	
	this.length=length;
	System.out.println(length);
	
}
Candle(ddouble length,double price){
	
	this.length=length;
	this.price=price;
	System.out.println(length,price);
	
}
Candle(string fragrance){
	
	this.fragrance=fragrance;
	System.out.println(fragrance);
	
}
Candle(double length,double price,double fragrance){
	
	this.length=length;
	this.price=price;
	this.fragrance=fragrance;
		
}

}