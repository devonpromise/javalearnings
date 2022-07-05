import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main (String [] args){
        System.out.println("Hello World!");
        int value1 =  7;
        int value2 = 5;

        int maxValue  = value1 >  value2 ?  value1: value2;

        System.out.println(maxValue);

        float[] vals  = new float[3];
        float [] vals1 = {1.4f, 2.4f, 5.6f};
        int[] arrayInt = new  int [4];

        //for each
        for (float x:  vals1){
            System.out.println(x);
        }

        //Working with strings
        String name = "Marie";
        String greeting = "Hello"  + name;
        System.out.println(greeting);

        greeting +=  " good to see you";

        System.out.println(greeting);

        String s1  = "Jean";
        s1 +=  " Arielle";
        String s2 =  "Jean";
        s2 +=  " Arielle";

        s2.intern();


        if  (s1 == s2)
            System.out.println("Equal 1");

        if (s1.equals(s2))
            System.out.println("Equal 2");

        int iVal = 100;

        String sVal = String.valueOf(iVal);

        //STRING BUILDER
        String location = "Dubai";
        int flightNumber = 175;

        StringBuilder sb = new StringBuilder(40);
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);
        String message = sb.toString();

        String time ="9:00";
        int pos = sb.indexOf(" on");
        sb.insert(pos, " at ");
        sb.insert(pos + 4 , time);
        message = sb.toString();

        System.out.println(message);

        //String.format()

        int david = 17, dawson = 15, dillon = 8, gordon = 6;
        String s4 = "My Nephews are " + david + ", " + dawson + ", " + dillon + ", and " + gordon + " years old";
        String S5 = String.format("My Nephews are %d, %d ,%d and %d years old", david, dawson, dillon, gordon);

        int w= 5, x= 235, y = 481 , z= 12, iVal1 = 1234567, iNegVal = -456;
        double dval = 12345654.0d;

        //Paddingg  and width (- : left padding, )
        //# -  include radix
        //0 - zero-padding
        //- - left justify
        //, - include  grouping separator
        // space - apprend space
        // + - always show sign
        // ( - Enclose with a parentheses
        String s5 = String.format("W:%4d X:%4d", w, x);
        String s6 = String.format("W:%04d X:%04d", y, z);
        String s7 = String.format("W:%-4d X:%-4d", y, z);
        String s8 = String.format("%,d", iVal1);
        String s9 = String.format("%, .2f", dval);

        String s10 = String.format("% d", iVal1);
        String s11 = String.format("% d", iNegVal);


        String s12 = String.format("%+d", iVal1);
        String s13 = String.format("%+d", iNegVal);

        String s14 = String.format("%(d", iNegVal);

        System.out.println((s5));
        System.out.println((s6));
        System.out.println((s7));
        System.out.println((s8));
        System.out.println((s9));
        System.out.println((s10));
        System.out.println((s11));
        System.out.println((s12));
        System.out.println((s13));
        System.out.println((s14));

        //argument indexes
        //s2 =  String s7 = String.format("%2$d, %1$d", y, z);

        showDate() ;

    }

    private static void showDate() {
        LocalDate startDate =LocalDate.parse("2022-01-30");
        long daysToAdd = 4;
        LocalDate newDate = startDate.plusDays(daysToAdd);

        String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);

        //Primitive Wrapper Class (First letter is Capital) eg. String, Double, Integer, Float, Boolean


    }

    //method returning an array
    static int [] returnArr (int x, int i){
        int [] arrInt = new int[5];


        return  arrInt;

    }

    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] parts = userInput.split(" ");
        performOperations(parts);



    }

    private static void performOperations(String[] parts){
//        char opCode = opCodeFromString(parts[0]);
//        double leftval = valueFromWord(parts[1]);
//        double leftval = valueFromWord(parts[2]);
//        double  result = execute(opcode, leftval, rightval);
//        System.out.println(result);

    }



}
