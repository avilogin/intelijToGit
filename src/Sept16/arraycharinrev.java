package src.Sept16;

public class arraycharinrev {
    public static void main(String[] args) {
        char ar [] = {'a','b','c','d','e','f'};
        char c;
        //System.out.println(ar.length);

        for (int i = ar.length-1;i>=0;i--)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        int left = 0;
        int right = ar.length-1;

        while(left<right)
        {
            c = ar[left];
            ar[left]= ar[right];
            ar[right] = c;

            left++;
            right--;
        }
        for (int i =0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }


    }
}
