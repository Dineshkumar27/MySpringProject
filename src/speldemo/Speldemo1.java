package speldemo;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Speldemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionParser parser = new SpelExpressionParser();

		// parse a plain text
		Expression exp = parser.parseExpression("'Welcome to Fita'");
		String message = (String) exp.getValue();
		System.out.println(message);

		// invoke a method
		exp = parser.parseExpression("'Welcome to Fita'.concat('!')");
		message = (String) exp.getValue();
		System.out.println(message);

		// get a property
		exp = parser.parseExpression("'Welcome to Fita'.bytes");
		byte[] bytes = (byte[]) exp.getValue();
		System.out.println(bytes.length);

		// get nested properties
		exp = parser.parseExpression("'Welcome to fita'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);

		// Calling constructor
		exp = parser.parseExpression("new String('Welcome to fita').toUpperCase()");
		message = (String) exp.getValue();
		System.out.println(message);
	}
}
