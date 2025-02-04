package inputstreamreaderproblems;

import java.io.*;

public class ConvertByteToCharacterStream {
    public static void main(String[] args) {
    try(FileInputStream file = new FileInputStream("src/inputstreamreaderproblems/file.txt");
        InputStreamReader is = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(is)){

        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
