package src.SeptPractice.sept18;

public class printSentInRev {
    public static void main(String[] args) {
        String str = "I am a good Man and i know it";
        String arr[] = str.split(" ");
        for (int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
