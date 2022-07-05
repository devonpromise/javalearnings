package cmdArgs;

import calc.PowerOf;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Main {
    public static void main (String [] args){

        if(args.length == 0){
            showUsage();
            return;
        }

        String filename = args[0];

        if(!Files.exists(Paths.get(filename))){
            System.out.println("\n File not found: "  + filename);
        }
        showFileLines(filename);

        //Properties
        Properties props = new Properties();

        props.setProperty("displayName", "Jim Wilson");
        String name = props.getProperty("displayName");
        String actNum = props.getProperty("accountNumber");
        String nextPosition = props.getProperty("position", "1");

        //Storing Properties as Simple Text
        Properties  props1 = new Properties();
        props1.setProperty("displayName", "Jim Wilson");
        props1.setProperty("accountNumber", "123-45-6789");
        try(Writer write = Files.newBufferedWriter(Paths.get("xyz.properties"))) {
            props1.store(write , "My comment");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //XML Properties



    }

    private static void showFileLines(String fileName){
        System.out.println();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line = null;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showUsage(){
        System.out.println();
        System.out.println("Please provide the filename to process on the commandline");
    }
}


