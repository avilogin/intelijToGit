package src.OctPractice.Sept5.Oct25;

public class freqWithoutHashMap {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 1, 2, 0};
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++)
        {
            if (freq[i] == visited)
                continue; // Skip already counted elements

            int count = 1;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    freq[j] = visited; // Mark as visited
                }
            }
            freq[i] = count; // Update frequency for the current element
        }

        // Display the frequency of each element
        System.out.println("Element | Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + "       | " + freq[i]);
            }
        }
    }
}
