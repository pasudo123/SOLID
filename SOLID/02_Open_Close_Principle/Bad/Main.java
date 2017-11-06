package Bad;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - OCP 의 나쁜 예 
 * 
 *********************/

class Greeter{
	String formality;
	
	public String greet(){
		if(this.formality == "formal"){
			return "Good evening, sir.";
		}
		
		else if(this.formality == "casual"){
			return "Sup bro?";
		}
		
		else if(this.formality == "intimate"){
			return "Hello Darling!";
		}
		
		else{
			return "Hello.";
		}
	}
	
	public void setFormality(String formality){
		this.formality = formality;
	}
}
