package filereaderproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLinebyLine {
    public static void main(String[] args) throws IOException {
        String filePath = "src/filereaderproblems/file.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("catch the exception");
        }
    }
}
