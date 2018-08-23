package lucasabreu.Calculadora;

public class Calculator {
	public int evaluate(String expression) {
		int sum = 0, nextAdd = 0, nextSub = 0, currChar = 0, nextChar = 0, nextNumber = 0;
		while( currChar < expression.length() ) {
			nextAdd = expression.indexOf("+", currChar);
			nextSub = expression.indexOf("-", currChar);
			if( ( nextAdd < nextSub ) && (nextAdd > -1) ) {
				nextNumber = Integer.valueOf(expression.substring(currChar, nextAdd));
				nextChar = nextAdd;
			} else if( ( nextAdd > nextSub ) && (nextSub > -1) ) {
				nextNumber = Integer.valueOf(expression.substring(currChar, nextSub));
				nextChar = nextSub;
			} else if( nextAdd == nextSub )
				nextNumber = Integer.valueOf(expression.substring(currChar, expression.length()));
			nextChar = expression.length();

			if( expression.charAt(currChar) == '-' )
				sum -= nextNumber;
			else
				sum += nextNumber;
			currChar = nextChar;
		}
		return sum;	
	}

}
