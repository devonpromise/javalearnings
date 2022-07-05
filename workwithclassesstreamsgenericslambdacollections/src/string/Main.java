package string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String [] args){
        StringJoiner sj = new StringJoiner(", ");
     //   StringJoiner sj = new StringJoiner("], [", "[", "]");
        sj.add("alpha");
        sj.add("beta");
        sj.add("gamma");

        String theResult = sj.toString();

        System.out.println(theResult);

        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("alpha");
        sj1.add("beta");
        sj1.add("gamma");

        String theResult1 = sj1.toString();

        System.out.println(theResult1);

        StringJoiner sj2 = new StringJoiner(", ", "{","}");
        sj2.add("alpha");
        String theResult2 = sj2.toString();
        System.out.println(theResult2);


        StringJoiner sj3 = new StringJoiner(", ", "{","}");
        sj2.add("EMPTY");
        String theResult3 = sj3.toString();
        System.out.println(theResult3);

        //Concatenation vs Formatting
        int  david = 13, dawson = 11, dillon = 4, gordon = 2;
        String s1  = "My nephews are " + david + ", " + dawson + ", " + dillon + ", and "+ gordon + " years old";
        System.out.println(s1);

        //Format
        String s2 = String.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
        System.out.println(s2);
        double avgDiff = ((david - dawson) +  (dawson - dillon) + (dillon - gordon)) / 3.0d;

        String  s3 = "The average age between  each is " + avgDiff + " years";
        System.out.println(s3);
        String  s4 = String.format("The average age between  each is %.1f years", avgDiff);
        System.out.println(s4);

        //Split and match and Regular Expression

        String s5 = "apple, apple and orange please";
        String s6 = s5.replaceAll("ple//b","ricot");
        System.out.println(s6);

        String[] parts = s1.split("\\b");

        for(String thePart: parts)
            if(thePart.matches("\\w+"))
                System.out.println(thePart);

        //Regular Expression - PATTERN and MATCHER

        String value1 = "apple, apple and orange please";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(value1);

        while (matcher.find())
            System.out.println(matcher.group());


    }
    void doWrite(int david, int dawson, int dillon, int gordon, double avgDiff )throws IOException{
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("myFile.txt"));
        try(Formatter f = new Formatter(writer)){
            f.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
            f.format("The average age between  each is %.1f years", avgDiff);
        }

    }

    //Java 8 Formatter

    //date/time formatting
}
