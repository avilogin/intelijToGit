package src.SeptPractice.sept18;

public class remDupCharInString {
    public static void main(String[] args) {
        String s = "avijjeetta";
        String result = "";

        for (int i =0;i<s.length();i++)
        {
             String ch = ""+s.charAt(i);
             if (result.contains(ch))
             {
                 continue;
             }
             result = result+ch;
        }
        System.out.println(result);

    }
}
