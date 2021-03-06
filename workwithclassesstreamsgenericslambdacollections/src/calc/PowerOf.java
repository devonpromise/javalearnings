package calc;

public class PowerOf implements MathProcessing {

    private String formattedOutput;
    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        double product =  Math.pow(leftVal, rightVal);
        formattedOutput = leftVal + " to the power  of "  + rightVal  + " is " + product;
        return product;
    }

    @Override
    public String getFormattedOutput() {
        return formattedOutput;
    }
}
