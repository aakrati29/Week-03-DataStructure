package filereaderproblems;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrenceOfaWord {
    public static void main(String[] args) {
        String filePath = "src/filereaderproblems/file.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            int count = 0;
            while((line = br.readLine()) != null){
                String str[] = line.split(" ");
                for(String i : str){
                    if(i.equalsIgnoreCase("line")){
                        count++;
                    }
                }
            }
            System.out.println("\"Line\" word present " + count + " times");
        }

        catch(Exception e){
            System.out.println("Catch the exception");
        }
    }
}
