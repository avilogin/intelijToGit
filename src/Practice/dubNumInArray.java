package src.Practice;

public class dubNumInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};

        for (int i =0;i<arr.length;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
