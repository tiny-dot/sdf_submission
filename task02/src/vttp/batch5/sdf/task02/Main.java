package vttp.batch5.sdf.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
		private int row;
		private int column;
		private char[][]board= new char[3][3];
		private String file;

		 //build board
	public void board() throws FileNotFoundException, IOException{
		File f = new File(file);
		Reader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		String line;
		 
	 // 	file data 
		 while ((line = br.readLine()) != null) {  
			 board = initializeBoard(row, column);
			 populateBoard(br);
			 return;  
	   }
	}
	 
	 //initialise board
	 private char[][] initializeBoard(int row, int column) { //method 5: make new board
		 char[][] board = new char[row][0]; 
		 String line="i";
		for (int y = 0; y < column; y++)
			board[y] = line.toCharArray();
		 return board;
	  }
	 //populate board, file as parameter - 
	 public void populateBoard(BufferedReader br)throws IOException{
		 String line="i";
		 int y = column;
		 while((br.readLine())!= null){
			 char [] data = line.toCharArray();
			 for (int x=0; x<data.length;x++){
				 board[y][row]=data[x];
			 }
		 }
	 }
	 
   
	 //availability method - check if there are possible positions
	 public boolean availablePositions(char[][] board) {
		char[][] board2 = new char[3][3];
		 for (int x=0;x<board2.length;x++)
		 	for(int y=0; y<board2[x].length;y++)
		 		if (board[x][y]=='.')
		 			return true;
		return false;
		}

	 //rules method - determine utility of position
	 public int utility(char[][] board) {
		 //by rows
		 
		 for (int x = 0; x < 3; x++) {
			 if (board[x][0] == board[x][1] && board[x][0] == board[x][2]) {
				 if (board[x][0] == 'X') return 1;
				 else if (board[x][0] == 'O') return -1;
			 }
		 }
		 //by column
		 for (int y = 0; y < 3; y++) {
			 if (board[0][y] == board[1][y] && board[0][y] == board[2][y]) {
				 if (board[0][y] == 'X') return 1;
				 else if (board[0][y] == 'O') return -1;
			 }
		 }
		 //diagonal
		 if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			 if (board[0][0] == 'X') return 1;
			 else if (board[0][0] == 'O') return -1;
		 }
	 
		 if (board[0][2] == board[1][1] && board[0][0] == board[2][0]) {
			 if (board[0][2] == 'X') return 1;
			 else if (board[0][2] == 'O') return -1;
		 }
	 
		 //draw- 0 points
			 //row
		 for (int x = 0; x < 3; x++) {
			 if (board[x][0] == board[x][1] || board[x][1] == board[x][2] || board[x][0] == board[x][2] ) {
				 return 0;
			 }
		 }
			 //column
		 for (int y = 0; y < 3; y++) {
			 if (board[y][0] == board[y][1] || board[y][1] == board[y][2] || board[y][0] == board[y][2]) {
				 return 0;
			 }
		 }
			 //diagonals
		 if (board[0][0] != board[1][1] || board[1][1] != board[2][2]) {
			 return 0;
		 }
	 
		 if (board[0][2] != board[1][1] || board[1][1] != board[2][0]) {
			 return 0;
		 }
		 return 0;
	 }
	 

			
		public static void main(String[] args) throws Exception {
			

		
		if (args.length < 1) { 
			System.err.println("Absent file");
			System.exit(1);
		 }
   
		 Main ttt = new Main(); 
		 ttt.board(); 
		

	}
}

