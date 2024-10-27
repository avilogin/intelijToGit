package src.OctPractice.Sept5.Oct27;

public class arrCharInRev {
    public static void main(String[] args) {
        char char_arr[] = {'A','B','C','D','E','F','G','H','I'};
        System.out.println(char_arr);
        int left = 0, right = char_arr.length-1;
        char temp;
        while(left<right)
        {
          temp = char_arr[left];
          char_arr[left]= char_arr[right];
          char_arr[right] = temp;
          left++;
          right--;
        }
        System.out.println(char_arr);

    }
}
