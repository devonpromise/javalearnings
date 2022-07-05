package stream1;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
        throw  new IOException("Exception from saySomething");
        //System.out.println("Something");
    }


    @Override
    public void close() throws Exception {
        throw  new IOException("Exception from close");
       // System.out.println("close");
    }
}
