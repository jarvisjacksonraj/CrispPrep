package CrispPrep.Day1;

public class RepeatAndMissing {

    public static int[] findRepeatMissing(int[] numArray) {
        int repeated = 0;
        int missing = 0;

        for (int i = 0; i < numArray.length; i++) {
            int absValue = Math.abs(numArray[i]);
            if (numArray[absValue - 1] > 0) {
                numArray[absValue - 1] = -numArray[absValue - 1];
            } else {
                repeated = absValue;
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0) {
                missing = i+1;
            }
        }

        return new int[]{repeated, missing};
    }

}
