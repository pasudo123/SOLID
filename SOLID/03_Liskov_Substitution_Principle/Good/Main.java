package Good;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - LSP 의 좋은 예 
 * 
 *********************/

class BedroomAdder{
	public void addBedroom(PenthouseSuite penthouse){
		penthouse.numberOfBedrooms += 1;
	}
}

class PenthouseSuite{
	int squareFootage;
	int numberOfBedrooms;
	
	public PenthouseSuite(){
		this.numberOfBedrooms = 4;
	}
	
	public void setSquareFootage(int sqft){
		this.squareFootage = sqft;
	}
}

class Studio{
    int squareFootage;
    int numberOfRooms;

    public Studio() {
        this.numberOfRooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}