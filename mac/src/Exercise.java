import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Exercise {


    public static void main (String[] args){

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(3);


        HashSet set = new HashSet();
        set.add (new Trade(1, "right"));
        set.add (new Trade(1, "right"));
        set.add (new Trade(1, "right"));
        set.add (new Trade(1, "right"));
        set.add (new Trade(1, "right"));


        Collections.sort(intList);


        int size  =  intList.size();


        for (int i = 0; i < size ; i ++ ){
            for (int j = i + 1; j < size; j++){

                if (intList.get(i).equals(intList.get(j)) == true ){
                    intList.remove(j);
                    size = size - 1;

                }
            }

        }


        System.out.print(intList);

        System.out.print(set);

    }



}


