package src.sept18;

public class charArrInRev {
    public static void main(String[] args) {
        char arr[] = {'A','B','C','D','E','F','G','H','I'};

        for (int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
