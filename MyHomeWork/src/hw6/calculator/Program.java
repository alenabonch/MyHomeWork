package hw6.calculator;

public class Program {
	
	private Calculator calculator = new Calculator();
	
	public void runCalculator(String[] data) {
		
		print(data);
		
		analyzeAndExecute(data);

	}
	
	private void analyzeAndExecute(String[] data) {		
		
		int rightNumber;	
		
		try {
			calculator.total = Integer.parseInt(data[0]);	
			
			for (int i = 1; i < data.length; i++) {				
				
				if (isCommand(data[i]) && i < data.length-1) {
					rightNumber = Integer.parseInt(data[i+1]);
					makeCommand(data[i], rightNumber);
                    i += 1;                    
				} else if (isCommand(data[i]) && i == data.length-1) {
                    makeCommand(data[i], 0);
                }
			}
		} catch(NumberFormatException e) {
			System.err.println("Incorrect expression, check the input data");
		}		
	}

	private void makeCommand(String command, int rightNumber) {
		
		switch(command) {
		
		case "plus":
			calculator.new Plus(rightNumber).realExecute();
			break;
			
		case "minus":
			calculator.new Minus(rightNumber).realExecute();
			break;
			
		case "get":
			calculator.new Get().realExecute();
			break;
			
		case "clear":
			calculator.new Clear().realExecute();
			break;
		}
	}

	private boolean isCommand(String s) {		
		return s.equals("plus") || s.equals("minus") ||
				s.equals("get") || s.equals("clear");
	}

	private void print(String[] args) {
		if (args != null) {
			for (String arg : args) {
				System.out.print(arg + " ");
			}
		} else {
			System.out.println("Command line arguments is empty");			
		}
		
	}

}
