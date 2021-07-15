package CrispPrep.Day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Day2Test {

    @Test
    public void testDay2Problem1() {
        List<Pair> input = new ArrayList<Pair>();
        input.add(new Pair(1, 4));
        input.add(new Pair(2, 5));
        input.add(new Pair(7, 9));

        List<Pair> result = new ArrayList<Pair>();
        result.add(new Pair(1, 5));
        result.add(new Pair(7, 9));

        Assert.assertEquals(2, MergeIntervals.merge(input).size());

        input = new ArrayList<Pair>();
        input.add(new Pair(6, 7));
        input.add(new Pair(2, 4));
        input.add(new Pair(5, 9));
        input.add(new Pair(11, 31));

        Assert.assertEquals(3, MergeIntervals.merge(input).size());
    }

    @Test
    public void testDay2Problem2() {
        int[] arr1 = {1, 12, 14, 17, 23};
        int[] arr2 = {11, 19, 27};
        int[] ExpectedResultantArray = {1, 11, 12, 14, 17, 19, 23, 27};
        int[] resultantArray = MergeSortedArray.mergeArrays(arr1, arr2);
        Assert.assertArrayEquals(ExpectedResultantArray, resultantArray);
    }

    @Test
    public void testDay2Problem3() {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = KadaneAlgorithm.maxSubArraySum(a, n);
        Assert.assertEquals(7, max_sum);
    }


}
