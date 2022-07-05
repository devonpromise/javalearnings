package calc;

public class Adder extends CalculateBase implements MathProcessing {

    public Adder(){}

    public Adder (double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();

        setResult(value);

    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setLeftVal(rightVal);
        calculate();
        return getResult();
    }
}
