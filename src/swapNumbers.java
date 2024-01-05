package src;

import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        //By using temporary variable

        Scanner sc = new Scanner(System.in);
        System.out.print("Provide first Number for A -> ");
        int fNo = sc.nextInt();
        System.out.print("Provide second Number for B -> ");
        int sNo = sc.nextInt();
        int temp = 0;

        temp=fNo;
        fNo=sNo;
        sNo=temp;

        System.out.println("Value of A is now "+fNo);
        System.out.println("Value of B is now "+sNo);



    }
}
