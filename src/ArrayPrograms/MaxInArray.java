package src.ArrayPrograms;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 1, 99, 1, 1};
        int max = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];

            }

        }
        System.out.println("Maximum Number in array is "+max);
    }

}
