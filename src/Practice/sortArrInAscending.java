package src.Practice;

public class sortArrInAscending {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77,5,9,2,5,7,88,22};
        int temp = 0;
        for (int i =0;i< arr.length-1;i++)
        {
            for (int j = i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i  =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
