package src.SeptPractice.sept18;

public class revStr {
    public static void main(String[] args) {
        String s =  "Avijeet";
        StringBuffer sb =  new StringBuffer(s);

//        String rev = sb.reverse().toString();
//        System.out.println(rev);
        //or
        StringBuffer rev2 =  sb.reverse();
        System.out.println(rev2);

    }
}
