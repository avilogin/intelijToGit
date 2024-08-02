package src.ArrayPrograms;

public class OddEvenInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77};
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i]%2!=0)
            {
                System.out.println(arr[i]+" is odd");
            }
            else
                System.out.println(arr[i]+" is even");
        }

    }
}
