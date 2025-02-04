package challengeproblems;

import java.io.*;

public class CompareFileReaderAndInputSteamReader {
    public static void main(String[] args) {

        long start, end;
        start = System.nanoTime();
        try(FileReader read = new FileReader("src/challengeproblems/file.txt");
            BufferedReader br = new BufferedReader(read)){

            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        end = System.nanoTime();
        System.out.println("Time taken by FileReader in nano sec : " + (end-start));


        start = System.nanoTime();
        try(FileInputStream file = new FileInputStream("src/challengeproblems/file.txt");
            InputStreamReader is = new InputStreamReader(file);
        BufferedReader br = new BufferedReader(is)){
            String line;
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        end = System.nanoTime();

        System.out.println("Time taken bt InputStreamReader in nano sec : " + (end-start));
    }
}
