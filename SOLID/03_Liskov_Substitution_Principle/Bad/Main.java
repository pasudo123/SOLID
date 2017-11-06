package Bad;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - LSP 의 나쁜 예 
 * 
 *********************/

abstract class Apartment{
	int squareFootage;		// 평당 길이
	int numberOfBedrooms;	// 화장실 수
	
	abstract void setSquareFootage(int sqft);
}

class Studio extends Apartment{
	public Studio(){
		this.numberOfBedrooms = 0;
	}
	
	@Override
	void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class PenthouseSuite extends Apartment{
	public PenthouseSuite(){
		this.numberOfBedrooms = 4;
	}
	@Override
	void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
}

class UnitUpgrader{
	public void upgrade(Apartment apartment){
		apartment.squareFootage += 40;
		
		if(apartment.getClass() != Studio.class){
			apartment.numberOfBedrooms += 1;
		}
	}
}

