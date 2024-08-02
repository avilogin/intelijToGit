package src.ArrayPrograms;

public class ArrayNumberInReverse {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77};

        System.out.println("Array order is ");
        for (int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse order is ");

        for (int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
