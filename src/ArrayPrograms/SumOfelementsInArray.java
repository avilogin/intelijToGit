package src.ArrayPrograms;

public class SumOfelementsInArray {
    public static void main(String[] args) {
        int sum = 0 ;
        int [] arr = {10, 30, 10, 20, 20,10};
        for (int i = 0; i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of array elements is :"+sum);
    }
}
