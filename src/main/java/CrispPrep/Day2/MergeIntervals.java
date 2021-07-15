package CrispPrep.Day2;

import java.util.*;


public class MergeIntervals {

    public static List<Pair> merge(List<Pair> intervals) {
        if (intervals.size() < 2)
            return intervals;

        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Pair> mergedIntervals = new LinkedList<Pair>();
        Iterator<Pair> intervalItr = intervals.iterator();
        Pair interval = intervalItr.next();
        int start = interval.start;
        int end = interval.end;

        while (intervalItr.hasNext()) {
            interval = intervalItr.next();
            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            } else {
                mergedIntervals.add(new Pair(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Pair(start, end));

        return mergedIntervals;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {

            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

}