package src.SeptPractice.sept18;

public class CharInStringComparission {
    public static void main(String[] args) {
        String s = "avijeet";
        String c = "Avijeet";

        for (int i =0;i<s.length();i++)
        {
            if (s.charAt(i)==c.charAt(i))
            {
                System.out.println(s.charAt(i)+" is same with "+c.charAt(i));
            }
            else
            {
                System.out.println(s.charAt(i)+" is not same with "+c.charAt(i));
            }
        }
    }
}
