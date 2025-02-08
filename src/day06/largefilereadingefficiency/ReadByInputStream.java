package day06.largefilereadingefficiency;

import java.io.*;

public class ReadByInputStream {

    public void readByInputStream(String path) {
        try (FileInputStream file = new FileInputStream(path);
             InputStreamReader is = new InputStreamReader(file);
             BufferedReader br = new BufferedReader(is)){

            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
