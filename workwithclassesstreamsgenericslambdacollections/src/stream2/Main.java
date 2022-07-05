package stream2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String [] args) throws IOException, URISyntaxException {
        String[] data = {
                "Line 1",
                "Line 2 2",
                "Line 3 3 3",
                "Line 4 4 4 4",
                "Line 5 5 5 5 5"
        };

        try(FileSystem zipFs = openZip(Paths.get("myData.zip"))){
            copyToZip(zipFs);
            writeToFileinZip1(zipFs, data  );
            writeToFileinZip2(zipFs, data);
        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    private static  FileSystem openZip(Path zipPath) throws IOException, URISyntaxException{
        Map<String,  String> providerProps = new HashMap<>();
        providerProps.put("create", "true");
        URI zipURi  = new URI("jar.file", zipPath.toUri().getPath(), null);
        FileSystem zipFs = FileSystems.newFileSystem(zipURi, providerProps);
         return zipFs;
    }

    private static void copyToZip(FileSystem zipFs) throws IOException{
        Path sourceFile = Paths.get("file1.txt");
     //   Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path destFile = zipFs.getPath("/fileCopied.txt");

        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING );

    }

    private static void writeToFileinZip1(FileSystem zipFs, String [] data) throws  IOException{
        try(BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))){
            for (String d: data){
                writer.write(d);
                writer.newLine();
            }
        }

    }

    private static void writeToFileinZip2(FileSystem zipFs, String [] data) throws  IOException{
        Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data), Charset.defaultCharset(), StandardOpenOption.CREATE);


    }
}
