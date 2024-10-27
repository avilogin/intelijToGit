package src.NumberPrograms;

public class SwapNumberUsingXOR {
    public static void main(String[] args) {
        int first =10, second = 20;
        System.out.println(first);
        System.out.println(second);
        first = first^second; // Step 1: a now becomes a ^ b
        second = first^second; // Step 2: b becomes (a ^ b) ^ b = a
        first = first^second; // Step 3: a becomes (a ^ b) ^ a = b
        System.out.println("-----------");
        System.out.println(first);
        System.out.println(second);
    }
}
