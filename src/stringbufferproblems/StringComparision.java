package stringbufferproblems;

public class StringComparision {

    static void comparing(String str){

        long startTime,endTime;
        StringBuilder builder = new StringBuilder();

        startTime=System.nanoTime();
        for(int i=0;i<1000000;i++){
            builder.append(str);
        }
        endTime=System.nanoTime();

        System.out.println("Time taken by String Builder in nano sec is : "+(endTime-startTime));

        StringBuffer buffer = new StringBuffer();
        startTime = System.nanoTime();

        for(int i = 0; i < str.length(); i++){
            buffer.append(str);
        }
        endTime = System.nanoTime();

        System.out.println("Time taken by String Buffer in nano sec is : "+(endTime-startTime));

    }
    public static void main(String[] args) {
        String str = "hello";
        comparing(str);
    }
}
