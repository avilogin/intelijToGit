package src.Before2302;

import java.util.Scanner;

public class swapNumbers02 {
    public static void main(String[] args) {
        //By using temporary variable

        Scanner sc = new Scanner(System.in);
        System.out.print("Provide first Number for A -> ");
        int fNo = sc.nextInt();
        System.out.print("Provide second Number for B -> ");
        int sNo = sc.nextInt();

        fNo=fNo+sNo;
        sNo=fNo-sNo;
        fNo=fNo-sNo;
        System.out.println("Value of A is now "+fNo);
        System.out.println("Value of B is now "+sNo);



    }
}
