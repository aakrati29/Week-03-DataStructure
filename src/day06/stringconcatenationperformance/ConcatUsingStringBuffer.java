package day06.stringconcatenationperformance;

public class ConcatUsingStringBuffer {

    public String concatUsingStringBuffer(String str){
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        return sb.toString();
    }
}
