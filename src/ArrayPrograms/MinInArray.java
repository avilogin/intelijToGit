package src.ArrayPrograms;

public class MinInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {99, 200, 99, 0, 50,-5,-2};
        int min = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];

            }

        }
        System.out.println("Maximum Number in array is "+min);
    }

}
