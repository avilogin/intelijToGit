package src.OctPractice.Sept5.Oct23;

public class arrayNumInRev {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int j = arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
