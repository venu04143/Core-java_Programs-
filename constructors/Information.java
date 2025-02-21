package com.constructors;

class Information{
	public static void main(String[] args) {
//		System.out.println(super.countryId);
		
		States s1 = new States("Telangana",522342);
		s1.show();
		Country c1= new Country(654,"Germanny");
		System.out.println(c1.countryId);
		System.out.println(c1.countryName +"\n");
		States s2 = new States("Berlin",65656);
		s2.show();
		
		States s3 = new States("Kerala",522343,500,"Nirmal");
		s3.show();
		
		States s4 = new States("Dallas",2221331,250000,"Trump",911,"America","BRW",150000);
		s4.show();
		
	}
}
class Country {
	
	int countryId;
	String countryName;
	String countryFgcol;
	double countryPop;
	
	Country(){
		this(91,"India");
	}
	Country(int countryId,String countryName){
		this(countryId,countryName,"OWG",10000);
//		this.countryId=countryId;
//		this.countryName=countryName;
		
	}
	
	Country(int countryId, String countryName,String countryFgcol, double countryPop ) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryPop = countryPop;
		this.countryFgcol = countryFgcol;
	}
	
}
class States extends Country{
	
	String stateName;
	int statePincode;
	double statePop;
	String stateCm;
	
	States(){
		this("Andhra",522616);
	}
	States(String stateName,int statePincode){
		this(stateName,statePincode,700,"CBN");
		
	}
	States(String stateName, int statePincode, double statePop, String stateCm) {
		
		super();
		this.stateName = stateName;
		this.statePincode = statePincode;
		this.statePop = statePop;
		this.stateCm = stateCm;
	}
	States(String stateName, int statePincode, double statePop, String stateCm,int countryId,String countryName,String countryFgcol,double countryPop) {
		super(countryId,countryName,countryFgcol,countryPop);
		
		this.stateName = stateName;
		this.statePincode = statePincode;
		this.statePop = statePop;
		this.stateCm = stateCm;
	}
	void show() {
		System.out.println("CountryID : "+super.countryId);
		System.out.println("CountryName : "+super.countryName);
		System.out.println("CountryFlagCol : "+super.countryFgcol);
		System.out.println("CountryPpulation : "+super.countryPop);
		System.out.println();
		System.out.println("State Name : "+stateName);
		System.out.println("State Pin : "+statePincode);
		System.out.println("State Population : "+statePop);
		System.out.println("State Cm: "+stateCm);
		System.out.println("\n***********************\n");

	}
	
}