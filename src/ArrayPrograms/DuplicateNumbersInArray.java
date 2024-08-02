package src.ArrayPrograms;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77,5,9,2,5,7,88,22};
        System.out.println("Duplicate elements in given array: ");

        for(int i =0;i<arr.length;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }

    }
}
