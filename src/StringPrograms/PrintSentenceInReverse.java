package src.StringPrograms;

public class PrintSentenceInReverse {
    public static void main(String[] args) {
        String str = "I am a good Man and i know it";
        String[] arrStr = str.split(" ");
        for (int i = arrStr.length-1;i>=0;i--)
        {
            System.out.print(arrStr[i]+ " ");
        }

    }
}
