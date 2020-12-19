package refactoring.exercise03;
public class Expression {

	private char op;

	private Expression left;

	private Expression right;
//more precise solution
	private double constant;

	public Expression(double constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	//cannot be devided by 0
	public double evaluate() {
		switch (op) {
		case 'c':
			return constant;
		case '+':
			return left.evaluate() + right.evaluate();
		case '-':
			return left.evaluate() - right.evaluate();
		case '*':
			return left.evaluate() * right.evaluate();
		case '/':
			if (right.evaluate()==0) throw new ArithmeticException("Number can not be divided by 0");
			return left.evaluate() / right.evaluate();
		default:
			throw new IllegalStateException();
		}
	}
}
