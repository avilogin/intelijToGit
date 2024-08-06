package src.Practice;

public class maxiNArray {
    public static void main(String[] args) {
        int arr[] = {99,66,56,88,77,44,22,11,33,66,99,88,999};
        int max = arr[0];

        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is "+max);
    }
}
