package src.DecPractice;

public class duplicateInString {
    public static void main(String[] args) {
        String str = "Programming";
        int[] charCount = new int[256];

        char[] chArr = str.toCharArray();

        for (char ch :chArr)
        {
            charCount[ch]++;
        }

        for (char c = 0;c<charCount.length;c++)
        {
            if (charCount[c]>1)
            {
                System.out.println(c + " is present "+charCount[c] + " times");
            }
        }
    }
}
