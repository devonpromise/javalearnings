package stream1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args){

        doCloseSomething();
        doTryCatchFinally();
        doTryWithResources();
        doTryWithResourcesMulti();

    }

    public static void doTryWithResourcesMulti() {
        char[] buff = new char[8];
        int length;

/*        try(Reader reader = Helper.openReader("File.txt");){
            Writer writer = Helper.openWriter("file2.txt");


            while((length = reader.read(buff)) >= 0){
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }

    public static void doTryCatchFinally() {
        char[] buff = new char[8];
        int length;
        Reader reader = null;

        try{
         //   reader = Helper.openReader("File.txt");

            while((length = reader.read(buff)) >= 0){
                System.out.println("\nlength: " + length);
                for(int i = 0; i < length; i++)
                    System.out.print(buff[i]);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if (reader != null)
                    reader.close();

            }catch (IOException e2){
                System.out.println(e2.getClass().getSimpleName() + " - " + e2.getMessage());
            }
        }
    }

    public static void doTryWithResources() {
        char[] buff = new char[8];
        int length;

/*
        try(Reader reader = reader = Helper.openReader("File.txt");){


            while((length = reader.read(buff)) >= 0){
                System.out.println("\nlength: " + length);
                for(int i = 0; i < length; i++)
                    System.out.print(buff[i]);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }

    private static void doCloseSomething(){
        try(MyAutoCloseable ac = new MyAutoCloseable()) {
            ac.saySomething();
        }catch (IOException e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
            for (Throwable  t: e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        }catch (Exception e) {
           throw new RuntimeException(e);
        }
    }

    void doChain (InputStream in) throws IOException{
        int length;
        char[] charBuff = new char[128];

        try (InputStreamReader rdr = new InputStreamReader(in)){
            while ((length = rdr.read(charBuff)) >= 0){
                //
            }
        }
    }

    void writeData(String [] data) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))){
            for (String d: data){
                bw.write(d);
                bw.newLine();
            }
        }
    }

    void readData(String [] data) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            String  inValue;
            while ((inValue = br.readLine()) != null){
                System.out.println(inValue);
            }

            }
        }


    void readData1() throws IOException{
        try(BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"))){
            String  inValue;
            while ((inValue = br.readLine()) != null){
                System.out.println(inValue);
            }

        }
    }


    void readThenAll() throws IOException{

        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        for (String line: lines)
            System.out.println(line);
    }
}





