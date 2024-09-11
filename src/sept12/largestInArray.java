package src.sept12;

public class largestInArray {
    // How To Find The Largest Value From The Given Array
    public static void main(String[] args) {
        int arr[] = {11,55,77,88,00,99,5,444,33,22,1111};
        int max = arr[0];
        for (int i =1;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
