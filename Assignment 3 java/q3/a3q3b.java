import javax.swing.JOptionPane;

import java.io.InputStream;
import java.util.Scanner;
public class a3q3b {


	    public static void main(String[] args) {
	        char game[][] = new char[5][5];
	        String winner = "Draw!";
	        boolean playing = true;
	        Scanner scanner = new Scanner( System.in );
	        
	        while(playing){
	            game = gameboard(game);
	            
	            for (int i = 0; i < 9; i++) {
	                
	            	System.out.println(gameOutput(game) + "\n\n Player " + (i%2+1) + "s turn.('exit' to exit)");
	                String input = scanner.nextLine();// iput 
	                
	                if (input.equals("exit")){
	                    playing = false;
	                    break;
	                } else if (input.charAt(0) > 47 && input.charAt(0) < 58 && input.charAt(1) > 47 && input.charAt(1) < 58){
	                    
	                	if((i%2+1) == 1 && game[(input.charAt(0)-49)*2][(input.charAt(1)-49)*2] == '*'){
	                        game[(input.charAt(0)-49)*2][(input.charAt(1)-49)*2] = 'X';
	                        
	                        if (threeInARow(game,((input.charAt(0)-49)*2),((input.charAt(1)-49)*2), 'X')){
	                            winner = "Player 1 wins!";
	                            break;
	                        }
	                    } else if((i%2+1) == 2 && game[(input.charAt(0)-49)*2][(input.charAt(1)-49)*2] == '*'){
	                        game[(input.charAt(0)-49)*2][(input.charAt(1)-49)*2] = 'O';
	                        
	                        if (threeInARow(game,((input.charAt(0)-49)*2),((input.charAt(1)-49)*2), 'O')){
	                            winner = "Player 2 wins!";
	                            break;
	                        }
	                    
	                    } else {
	                    	System.out.println("That spot is taken!");
	                        i--;//loop 
	                    }
	                }
	            }
	            
	            System.out.println(winner + "\n\n" + gameOutput(game));
	        }
	        
	        
	        
	    }
	    
	    public static char[][] gameboard(char game[][]){
	        //fill empty spaces 
	        for (int i = 0; i < 5; i++) {
	            
	        	for (int j = 0; j < 5; j++) {
	                game[i][j] = ' ';
	            }
	        }
	        
	      
	        for (int i = 0; i < 5; i++) {
	            
	        	for (int j = 1; j <= 3; j+=2) {
	                game[j][i] = '-';
	            }
	        }
	        
	        
	        for (int i = 0; i <= 4; i+=2) {
	            
	        	for (int j = 1; j <= 3; j+=2) {
	                game[i][j] = '|';
	            }
	        }
	        
	        return game;
	    }
	    
	    public static String gameOutput(char game[][]){
	        String str = "";
	        
	     
	        for (int i = 0; i < game.length; i++) {
	            
	        	for (int j = 0; j < game.length; j++) {
	                str += game[i][j] + " ";
	            }
	            str += "\n";
	        }
	        
	        return str;
	    }
	    
	    public static boolean threeInARow(char game[][], int row, int column, char xo){

	        return (       game[row][0] == xo && game[row][2] == xo && game[row][4] == xo || 
	        			   game[0][column] == xo  && game[2][column] == xo && game[4][column] == xo ||
	                       game[0][0] == xo && game[2][2] == xo && game[4][4] == xo ||          
	                       game[0][4] == xo  && game[2][2] == xo && game[4][0] == xo);

	}

}
