package day06.stringconcatenationperformance;

public class Main {

    public static long byString(String str){
        long startTime, endTime;
        startTime = System.nanoTime();
        ConcatenateInString cs = new ConcatenateInString();
        cs.conactenateInString(str);
        endTime = System.nanoTime();

        return  endTime-startTime;
    }

    public static long byStringBuilder(String str){
        long startTime, endTime;
        startTime = System.nanoTime();
        ConcatUsingStringBuilder csb = new ConcatUsingStringBuilder();
        csb.concatUsingStringBuilder(str);
        endTime = System.nanoTime();

        return  endTime-startTime;
    }

    public static long byStringBuffer(String str){
        long startTime, endTime;
        startTime = System.nanoTime();
        ConcatUsingStringBuffer csbf = new ConcatUsingStringBuffer();
        csbf.concatUsingStringBuffer(str);
        endTime = System.nanoTime();

        return  endTime-startTime;
    }

    public static void main(String[] args) {
        int stringSize1 = 1000;
        int stringSize2 = 10000;
        int stringSize3 = 1000000;
        String str = " ";
        for(int i = 0; i < stringSize1; i++){
            str.concat("a");
        }

        for(int i = 0; i < stringSize2; i++){
            str.concat("a");
        }

        for(int i = 0; i < stringSize2; i++){
            str.concat("a");
        }

        System.out.println("\nTotal time taken to concatenate a string in Original String : " + byString(str));
        System.out.println("Total time taken to concatenate a string using String Builder: " + byStringBuilder(str));
        System.out.println("Total time taken to concatenate a string using String Buffer : " + byStringBuffer(str));

    }
}
