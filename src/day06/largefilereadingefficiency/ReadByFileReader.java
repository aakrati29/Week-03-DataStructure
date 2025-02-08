package day06.largefilereadingefficiency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByFileReader {

    public void readFile(String path){
        try(FileReader file = new FileReader(path);
            BufferedReader br = new BufferedReader(file)){

            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
