package src.OctPractice.Sept5.Oct25;

public class freqNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 1, 2, 0};
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i =0;i<arr.length;i++)
        {
            int count =1;
            if (freq[i]==visited)
                continue;

            for (int j = i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    freq[j] = visited;
                }
            }
            freq[i] = count;
        }
        for (int k =0;k<freq.length;k++)
        {
            if (freq[k]!=visited)
            {
                System.out.println(arr[k]+"----"+freq[k]);
            }
        }
    }
}
