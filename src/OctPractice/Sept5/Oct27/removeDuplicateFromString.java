package src.OctPractice.Sept5.Oct27;

public class removeDuplicateFromString {
    public static void main(String[] args) {
        String str = "aavijjeettt";
        System.out.println(str);
        String result= "";
        for (int i=0;i<str.length()-1;i++)
        {
            String ch = ""+str.charAt(i);
            if (result.contains(ch))
            {
                continue;
            }
            result = result+ch;
        }
        System.out.println("String after removing duplicates is");
        System.out.println(result);
    }
}
