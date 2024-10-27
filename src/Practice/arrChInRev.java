package src.Practice;

public class arrChInRev {
    public static void main(String[] args) {
        char arr[] = {'A','B','C','D','E','F','G','H','I'};
        int left = 0, right = arr.length-1;
        char temp;

        while(left<right)
        {
          temp =   arr[left];
          arr[left]=arr[right];
          arr[right] = temp;
          left++;
          right--;
        }
        for (int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }


    }
}
