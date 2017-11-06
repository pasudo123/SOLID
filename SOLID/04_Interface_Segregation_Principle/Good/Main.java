package Good;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - ISP 의 좋은 예 
 * 
 *********************/

interface FeatheredCreature {
	public void molt();	// 털갈이
}

interface FlyingCreature {
	public void fly();
}

interface SwimmingCreature {
	public void swim();
}

// 독수리 클래스
class Eagle implements FlyingCreature, FeatheredCreature {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialNumberOfFeathers) {
        this.numberOfFeathers = initialNumberOfFeathers;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}

// 펭귄 클래스
class Penguin implements SwimmingCreature, FeatheredCreature {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }

    public void molt() {
        this.numberOfFeathers -= 4;
    }
}