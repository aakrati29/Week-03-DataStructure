package inputstreamreaderproblems;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ReadUserInputAndWriteToFile {
    public static void main(String[] args) {
        try(InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        FileWriter write = new FileWriter("src/inputstreamreaderproblems/result.txt")){
            String line;
            while(!(line=br.readLine()).equalsIgnoreCase("exit")){
                write.write(line + System.lineSeparator());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
