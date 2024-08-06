package src.StringPrograms;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String orig_str = "Who and where are you";

        String[] strarr = orig_str.split(" ");
        String finalstr = "";

        for(String word :strarr)
        {
            int len = word.length()-1;
            String reverseWord ="";
            while(len>=0)
            {
                char ch = word.charAt(len);
                reverseWord = reverseWord+ch;
                len--;
            }
            finalstr =finalstr+reverseWord+" ";
        }

        System.out.println(finalstr);
    }
}
