package day06.stringconcatenationperformance;

public class ConcatenateInString {

    public String conactenateInString(String str){
        str = str.concat(str);
        return str;
    }
}
