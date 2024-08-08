package src.Practice;

public class reverseeachword {
    public static void main(String[] args) {
        String ori_str = "I am a happy happy person";
        String [] str_arr = ori_str.split(" ");
        int word_len;
        String final_word = "";
        for (String word: str_arr)
        {
           word_len = word.length()-1;
           String rev_word = "";
           while(word_len>=0)
           {
               char ch = word.charAt(word_len);
               rev_word = rev_word+ch;
               word_len--;

           }
           final_word = final_word+rev_word+" ";
        }
        System.out.println(final_word);
    }
}
