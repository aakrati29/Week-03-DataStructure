package day05.linearsearchproblems;

public class SearchASpecificWord {

    private static String searchSpecialWord(String paragraph, String target) {
        String[] sentences = paragraph.split("\\.");

        for(String sentence : sentences){
            String[] words = sentence.split(" ");
            for(String word : words){
                if(word.equalsIgnoreCase(target)){
                    return sentence;
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String paragraph = "Despite the fact that piranhas are relatively harmless, many people continue to believe the pervasive myth that piranhas are dangerous to humans. This impression of piranhas is exacerbated by their mischaracterization in popular media. For example, the promotional poster for the 1978 horror film Piranha features an oversized piranha poised to bite the leg of an unsuspecting woman. Such a terrifying representation easily captures the imagination and promotes unnecessary fear. While the trope of the man-eating piranhas lends excitement to the adventure stories, it bears little resemblance to the real-life piranha. By paying more attention to fact than fiction, humans may finally be able to let go of this inaccurate belief.";
        String target = "promotes";

        String result = searchSpecialWord(paragraph, target);
        System.out.println(result);
    }
}
