package Good;

import java.util.ArrayList;

/**********************
 * 
 * 작성일 : 2017 11 16
 * - SRP 의 좋은 예 
 * 
 *********************/

class BoardShaper{
	int size;
	
	public BoardShaper(int size){
		this.size = size;
	}
	
	// 이중 어레이 리스트
	public ArrayList<ArrayList<Integer>> rowIndexes() {
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < this.size; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            
            for (int j = 0; j < this.size; j++) {
                row.add((i*size)+(j));
            }
            
            rowIndexes.add(row);
        }

        return rowIndexes;
    }
}

class BoardPresenter {
	Board board;
	
	public BoardPresenter(Board board){
		this.board = board;
	}
	
	
	// 해당 보드 값에 대해서 한 줄을 출력하고, 다시 한 줄을 출력.
	public void displayBoard(){
		String formattedBoard = "";
		
        for (int i = 0; i < this.board.size*this.board.size; i++) {
            String borderOrNewline = "";
            
            if ((i+1) % board.size == 0) {
                borderOrNewline += "\n";
            }
            else {
                borderOrNewline += "|";
            }
            
            formattedBoard += board.spots.get(i);
            formattedBoard += borderOrNewline;
        }
        
        System.out.print(formattedBoard);
	}
}

class Board {
    int size;
    ArrayList<String> spots;
    
    // 생성자
    public Board(int size) {
        this.size = size;
        this.spots = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            this.spots.add(String.valueOf(3*i));
            this.spots.add(String.valueOf(3*i + 1));
            this.spots.add(String.valueOf(3*i + 2));
        }
    }

    
    // 파라미터로 오는 어레이리스트 값을 spots의 인덱스로 활용해서 리턴.
    public ArrayList<String> valuesAt(ArrayList<Integer> indexes) {
        ArrayList<String> values = new ArrayList<String>();

        for (int index : indexes) {
            values.add(this.spots.get(index));
        }

        return values;
    }
}
