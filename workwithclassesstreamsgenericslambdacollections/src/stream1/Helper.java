package stream1;

import java.io.*;

public class Helper {

    public Reader openReader(String fileLoc){

        try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))){
            int intVal;
            while((intVal = br.read()) >= 0){
                char charVal = (char) intVal;
                //
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;

    }
}
