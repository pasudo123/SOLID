package Bad;


import java.util.ArrayList;

/**********************
 * 
 * 작성일 : 2017 11 16
 * - SRP 의 나쁜 예
 * 
 *********************/

public class Main {
	ArrayList<String> spots;
	
	// 생성자
	// 멤버필드 초기화
	public Main(){
		this.spots = new ArrayList<String>();
		for(int i = 0; i < 9; i++){
			this.spots.add(String.valueOf(i));
		}
	}
	
	
	// firstRow 반환
	public ArrayList<String> firstRow(){
		ArrayList<String> firstRow = new ArrayList<String>();
		
		firstRow.add(this.spots.get(0));
		firstRow.add(this.spots.get(1));
		firstRow.add(this.spots.get(2));
		
		return firstRow;
	}
	
	// secondRow 반환
	public ArrayList<String> secondRow(){
		ArrayList<String> secondRow = new ArrayList<String>();
		
		secondRow.add(this.spots.get(3));
		secondRow.add(this.spots.get(4));
		secondRow.add(this.spots.get(5));
		
		return secondRow;
	}
	
	// thirdRow 반환
	public ArrayList<String> thirdRow(){
		ArrayList<String> thirdRow = new ArrayList<String>();
		
		thirdRow.add(this.spots.get(6));
		thirdRow.add(this.spots.get(7));
		thirdRow.add(this.spots.get(8));
		
		return thirdRow;
	}
	
	// 출력 
	public void display(){
		String formattedFirstRow = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n" + 
								   this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n" + 
								   this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8) + "\n";
		
		System.out.println(formattedFirstRow);
	}
}
