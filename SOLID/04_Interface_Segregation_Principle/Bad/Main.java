package Bad;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - ISP 의 나쁜 예 
 * 
 *********************/

interface Bird {
	public void fly();
	public void molt();	// 털갈이
}

// 독수리 클래스
class Eagle implements Bird {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}

// 펭귄 클래스
class Penguin implements Bird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
    
    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}