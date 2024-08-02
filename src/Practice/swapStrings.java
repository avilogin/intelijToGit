package src.Practice;

public class swapStrings {
    public static void main(String[] args) {
        String a = "Avijeet";
        String b = "Jana";
        System.out.println(a);
        System.out.println(b);
        a = a+b;
        //AvijeetJana

        b= a.substring(0,a.length()-b.length());//7-4 = 3 (0,3)
        a = a.substring(b.length());
        System.out.println("After swaping");
        System.out.println(a);
        System.out.println(b);
    }
}
