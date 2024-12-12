package src.ArrayPrograms;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,52,60,77};
        int sum = 0,count = arr.length;
        double avr;
        for (int i =0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        avr = sum/count;
        System.out.println("Average is "+ avr);

    }
}
