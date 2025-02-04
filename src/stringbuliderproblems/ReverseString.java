package stringbuliderproblems;

public class ReverseString {

    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));

    }
}
