package calc;

import flight.CargoFlight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rigthVals ={50.0d, 92.0d, 213.0d, 3.0};
//        char[] opCodes = {'d', 'a', 's','m'};
//        double[] results = new double[opCodes.length];
//
        //Array of Classes

/*        performCalculations();

        //Inheritance
        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);

        Adder adder = new Adder();
        doCalculation(adder, 25.0d, 92.0d);

        performMoreCalculations();
        executeInteractively();*/

        dynamicInterActivity();
        
    }

    private static void dynamicInterActivity(){
        System.out.println("Enter an operation and two numbers");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        DynamicHelper dh = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()

        });
        dh.process(userInput);
    }

    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] parts = userInput.split(" ");
        performOperations(parts);
    }

    private static void performOperations(String[] parts) {

        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        CalculateBase  cal = createCalculation(operation, leftVal, rightVal);
        cal.calculate();
        System.out.println("Operation performed: " + operation);
        System.out.println(cal.getResult());

    }

    private static CalculateBase createCalculation(MathOperation operation, double leftVal, double rightVal ){
        CalculateBase calculation = null;
        switch (operation){
            case ADD:
                calculation = new Adder(leftVal, rightVal);
                break;
            case SUBTRACT:
                calculation = new Subtractor(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal, rightVal);
                break;
            default:
                break;
        }

        return calculation;
    }

    private static void performMoreCalculations() {
        CalculateBase[]  calculation = {
                new Divider(6.0d,   2.0d),
                new Adder(1.0d,45.0d),
                new Subtractor(5.0d,30.0d),
                new Multiplier(1.0d,45.0d)

        };

        System.out.println();
        System.out.println("Array Calculations");

        for(CalculateBase cal: calculation){
            cal.calculate();
            System.out.println("result = " + cal.getResult());

        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal){
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);

        calculation.calculate();

        System.out.println("Calculation result = " + calculation.getResult());

    }


    private static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for(MathEquation eq: equations){
            eq.execute();
            System.out.println("result = "+  eq.result);
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());


    }

//    private static calc.MathEquation create(double leftVal, double rightVal, char opCode) {
//        calc.MathEquation equation = new calc.MathEquation(leftVal, rightVal, opCode);
//
//        return equation;
//    }

}
