package src.Sept05;

public class revStringUsingStringBuffer {
    public static void main(String[] args) {
        String a = "Avijeet";

        StringBuffer st = new StringBuffer(a);
        StringBuffer result = st.reverse();
        System.out.println(result);

    }
}
