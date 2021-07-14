package CrispPrep.Day1;

public class DuplicateNumber {

    public static int findDuplicate(int[] numArray) {
        int fast = numArray[0];
        int slow = numArray[0];

        do {
            slow = numArray[slow];
            fast = numArray[numArray[fast]];
        } while (slow != fast);

        slow = numArray[0];
        while (slow != fast) {
            slow = numArray[slow];
            fast = numArray[fast];
        }
        return slow;
    }

}
