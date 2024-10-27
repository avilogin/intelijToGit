package src.ArrayPrograms;

public class FrequencyOfNumbersInArray {
    public static void main (String[] args) {
        int [] arr = new int[]{5, 8, 5, 7, 8, 10,1,7,1,10,5,5,8,10};

        int [] freq =  new int[arr.length];
        int visited = -1;
        for(int i =0;i<arr.length;i++)
        {
            int count = 1;
            for (int j =i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    freq[j] = visited;
                }
                if(freq[i]!=visited)
                {
                    freq[i] = count;
                }
            }
        }
        for (int i = 0;i<freq.length;i++)
        {
            if (freq[i]!=visited)
            {
                System.out.println("Elements   |    Frequency");
                System.out.println(arr[i]+"        |         "+freq[i]);
            }
        }
    }
}
