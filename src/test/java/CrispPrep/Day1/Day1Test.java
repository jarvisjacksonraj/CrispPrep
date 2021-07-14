package CrispPrep.Day1;

import org.junit.Assert;
import org.junit.Test;

public class Day1Test {

    @Test
    public void testDay1() {
        int arr1[] = {1, 3, 4, 5, 5, 6, 2};
        int arr2[] = {2, 1, 0, 2, 1, 0, 2};

        int result1 = 5;
        int resultArr2[] = {0, 0, 1, 1, 2, 2, 2};

        int arr3[] = {7, 3, 4, 5, 5, 6, 2};
        int resultArr3[] = {5, 1};

        Assert.assertEquals(result1, DuplicateNumber.findDuplicate(arr1));
        Assert.assertArrayEquals(resultArr2, SortColors.sortArrayZeroOneTwo(arr2));
        Assert.assertArrayEquals(resultArr3, RepeatAndMissing.findRepeatMissing(arr3));

    }
}
