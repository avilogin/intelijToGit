package src.SeptPractice.sept18;

public class freqOfNum {
    public static void main(String[] args) {
        int ar[] = new int[] {5, 8, 5, 7, 8, 10,1,7,1,10,5,5,8,10};
        int freq[] =  new int[ar.length];
        int visited = -1;
        for (int i =0;i<ar.length;i++)
        {
            int count =1;

            for (int j =i+1;j<ar.length;j++)
            {
                if (ar[i]==ar[j])
                {
                    count++;
                    freq[j]=visited;
                }
                if (freq[i]!=visited)
                {
                    freq[i]=count;
                }
            }
        }
        for (int i = 0;i<freq.length;i++)
        {
            if (freq[i]!=visited)
            {
                System.out.println(ar[i] +" is appearing "+freq[i]+" times");
            }
        }

    }
}
