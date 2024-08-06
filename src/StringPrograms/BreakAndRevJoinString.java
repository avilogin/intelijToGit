package src.StringPrograms;

public class BreakAndRevJoinString {
    public static void main(String[] args) {


        String str = "Selenium";

        String first = str.substring(0, 4);
        String last = str.substring(4, str.length());
        int firLen = first.length()-1;
        int lastLen = last.length()-1;
        String fir_Rev = "", finalStr = "";
        while(firLen>=0)
        {
            fir_Rev = fir_Rev+first.charAt(firLen);
            firLen--;
        }

        String las_Rev = "";
        while(lastLen>=0)
        {
            las_Rev = las_Rev+last.charAt(lastLen);
            lastLen--;
        }


        System.out.println(first + "---"+fir_Rev);
        System.out.println(last + "---"+las_Rev);
        finalStr = fir_Rev.concat(las_Rev);
        //finalStr = fir_Rev+las_Rev;

        System.out.println("Final String is "+finalStr);


    }
}
