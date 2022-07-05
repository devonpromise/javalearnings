package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Main  {

    public static void main(String [] args){

        //Old way

        String[] words = {"Bye", "Hi", "Adios", "Hola", "Aloha"};


        //Old way
        Arrays.sort(words, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        //Lambda Expression
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(Arrays.toString(words));


    }
}
