package CrispPrep.Day2;

public class MergeSortedArray {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] resultantArray = new int[s1 + s2];
        int i = 0, j = 0, k = 0;

        while (i < s1 && j < s2) {
            if (arr1[i] < arr2[j])
                resultantArray[k++] = arr1[i++];
            else
                resultantArray[k++] = arr2[j++];
        }
        while (i < s1)
            resultantArray[k++] = arr1[i++];

        while (j < s2)
            resultantArray[k++] = arr2[j++];

        return resultantArray;
    }
}
