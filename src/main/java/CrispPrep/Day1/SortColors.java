package CrispPrep.Day1;

public class SortColors {

    public static int[] sortArrayZeroOneTwo(int[] numArray) {
        int lo = 0;
        int hi = numArray.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (numArray[mid]) {
                case 0: {
                    temp = numArray[lo];
                    numArray[lo] = numArray[mid];
                    numArray[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = numArray[mid];
                    numArray[mid] = numArray[hi];
                    numArray[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        return numArray;
    }
}
