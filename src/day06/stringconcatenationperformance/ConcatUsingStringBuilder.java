package day06.stringconcatenationperformance;

public class ConcatUsingStringBuilder {

    public String concatUsingStringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.toString();
    }
}
