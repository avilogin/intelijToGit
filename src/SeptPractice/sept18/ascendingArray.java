package src.SeptPractice.sept18;

public class ascendingArray {
    public static void main(String[] args) {
        int ar[] =  {1, 2, 3, 4, 5,66,33,88,55,22,44,77};
        int temp = 0;
       for (int i =0;i<ar.length;i++)
       {
           for (int j =i+1;j<ar.length;j++)
           {
               if (ar[i]>ar[j])
               {
                   temp = ar[i];
                   ar[i]= ar[j];
                   ar[j]=temp;
               }
           }
       }
        System.out.println("Ascending order is");

       for (int i =0;i<ar.length;i++)
       {
           System.out.print(ar[i]+" ");
       }
    }
}
