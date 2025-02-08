package day06.largefilereadingefficiency;

public class Main {

    public static void readUsingFileReader(String path){
        long startTime,endTime;
        startTime = System.nanoTime();
        ReadByFileReader fr = new ReadByFileReader();
        fr.readFile(path);
        endTime = System.nanoTime();

    }

    public static void usingInputStreamReader(String path){
        long startTime,endTime;
        startTime = System.nanoTime();
        ReadByInputStream is = new ReadByInputStream();
        is.readByInputStream(path);
        endTime = System.nanoTime();

    }

    public static void main(String[] args) {
        String path1MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_1MB";
        String path10MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_10MB";
        String path100MB="src/day06algorithmruntimeanalysis/largefilereadingefficiency/text_file_100MB";

        System.out.println("\nUsing File Reader Class It take time for 1MB, 10MB, and 100MB respectively : ");
        readUsingFileReader(path1MB);
        readUsingFileReader(path10MB);
        readUsingFileReader(path100MB);
        System.out.println("\nUsing Input Stream Reader Class It take time for 1MB, 10MB, and 100MB respectively : ");
        usingInputStreamReader(path1MB);
        usingInputStreamReader(path10MB);
        usingInputStreamReader(path100MB);
    }
}
