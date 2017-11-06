package Good;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - OCP 의 좋은 예 
 * 
 *********************/

interface Personality {
	public String greet();
}

class IntimatePersonality implements Personality{
	@Override
	public String greet() {
		return "Hello Darling!";
	}
}

class FormalPersonality implements Personality {
	@Override
    public String greet() {
        return "Good evening, sir.";
    }
}

class CasualPersonality implements Personality {
	@Override
    public String greet() {
        return "Sup bro?";
    }
}

class Greeter{
	private Personality personality;
	
	public Greeter(Personality personality){
		this.personality = personality;
	}
	
	public String greet(){
		return this.personality.greet();
	}
}