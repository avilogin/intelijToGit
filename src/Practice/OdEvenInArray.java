package src.Practice;

public class OdEvenInArray {
    public static void main(String[] args) {
        int arr[] = {99,66,56,88,77,44,22,11,33,66,99,88,999};

        for (int i =0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]+" is Odd");
            }
            else
            {
                System.out.println(arr[i]+" is Even");
            }
        }
    }
}
