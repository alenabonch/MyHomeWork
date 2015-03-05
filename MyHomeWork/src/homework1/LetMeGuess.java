package homework1;

import java.util.Scanner;

public class LetMeGuess {
	
    public static void main(String[] args) {  
    	
        new Game().start();        
    }
}

class Game {
	
    private int begin = 1;
    private int end = 100;
    private int middle;
    private int attempt = 7;
    private boolean win;
    private String answer;

    public void start() {    	
        System.out.println("Come up with a number from 1 to 100. " +
                			"I will try to guess it in 7 attempts.");
        System.out.println("Prompt me by typing 'less', 'more', or 'equal'\n");        
        do {        	
            middle = determineMiddleOfTheSegment(begin, end);
            System.out.println("Is it " + middle + "?");
            takeAnswerAndContinueOrEndOfGame();
        } while (attempt != 0 && !win);
        
        System.out.println("Game is over!");        
    }
    

    private int determineMiddleOfTheSegment(int begin, int end) {    	
        int middle = Math.round((end - begin) / 2) + begin;        
        attempt--;        
        return middle;
        
    }

    private void takeAnswerAndContinueOrEndOfGame() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("less")) {
            end = middle;
        } else if (answer.equalsIgnoreCase("more")) {
            begin = middle;
        } else if (answer.equalsIgnoreCase("yes")) {
            System.out.println("I guessed the number in " +  (7 - attempt) + " attempts!");
            win = true;
        } else if (answer.equalsIgnoreCase("exit")) {
            System.out.println("Good bye! Exiting... ");
            System.exit(0);
        } else {            
            System.out.println("Incorrect input");
            attempt++;
        }
    }
}
