package calc;

public class MathEquation {
    double leftval;
    double rightVal;
    char opCode;
    double result;

        //Static fields - all instances have the same value accross
    //static import statement - allows static methods to be used witthout being class-qualified
    //  static block - perform one time type initialization
    public static int nuOfCalculations;
    public static double sumOfResults;

    public MathEquation(double leftval, double rightVal, char opCode) {
        this.leftval = leftval;
        this.rightVal = rightVal;
        this.opCode = opCode;
    }

    public void execute(){
        switch (opCode){
            case 'a':
                result = leftval + rightVal;
                break;
            case 's':
                result = leftval - rightVal;
                break;
            case 'm':
                result = leftval * rightVal;
                break;
            case 'd':
                result = rightVal != 0? leftval / rightVal: 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;

        }

        nuOfCalculations++;
        sumOfResults+=result;

    }

    public static double getAverageResult(){
        return  sumOfResults / nuOfCalculations;
    }
}
