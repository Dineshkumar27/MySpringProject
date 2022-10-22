package speldemo;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Speldemo2 {

	public static void main(String[] args) {
		// creating a student object
		Student student = new Student();
		student.setId(1);
		student.setName("Ankit");

		ExpressionParser parser = new SpelExpressionParser();
		EvaluationContext context = new StandardEvaluationContext(student);
		Expression exp = parser.parseExpression("name");

		// evaluate object using context
		String name = (String) exp.getValue(context);
		System.out.println(name);

		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Rishant");

		// evaluate object directly
		name = (String) exp.getValue(student1);
		System.out.println(name);
		exp = parser.parseExpression("id > 1");

		// evaluate object using context
		boolean result = exp.getValue(context, Boolean.class);
		System.out.println(result); // evaluates to false

		result = exp.getValue(student1, Boolean.class);
		System.out.println(result); // evaluates to true
	}
}
