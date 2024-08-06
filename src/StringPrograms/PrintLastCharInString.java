package src.StringPrograms;

public class PrintLastCharInString {
    public static void main(String[] args) {
        String str = "AvijeetJanaMob";
        String first =  str.substring(0,7);//printing Avijeet
        String middle = str.substring(7,str.length()-3);//Printing Jana
        String last = str.substring(str.length()-3,str.length());
        System.out.println("First string is "+first);
        System.out.println("Middle string is "+middle);
        System.out.println("Last string is "+last);

    }
}
