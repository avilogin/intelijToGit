package src.OctPractice.Sept5.Oct26;

public class swapNumberWithout {
    public static void main(String[] args) {
        int first =10, second = 20;
        System.out.println(first);
        System.out.println(second);
        System.out.println("-----------");
        first = first+second;
        second = first-second;
        first = first-second;
        System.out.println(first);
        System.out.println(second);
    }
}
