package src.SeptPractice.Sept05;

public class largerstInArray {
    public static void main(String[] args) {
        int arr[] = {1,5,3,2,7,88,9,7,99,44,33,888};
        int max = arr[0];
        for (int i = 1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
