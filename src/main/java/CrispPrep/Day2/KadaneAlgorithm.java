package CrispPrep.Day2;

public class KadaneAlgorithm {
    static int maxSubArraySum(int a[], int size) {
        int maxSum = a[0];
        int currentMaxSum = a[0];

        for (int i = 1; i < size; i++) {
            currentMaxSum = Math.max(a[i], currentMaxSum + a[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
        }
        return maxSum;
    }
}
