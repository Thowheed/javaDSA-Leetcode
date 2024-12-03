package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveSorted2 {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        // List<Integer> value = new ArrayList<>();
        int countValue = 0;
        for (int n : nums) {
            // if(count.get(n) != null)
            // count.put(n, 1);
            count.put(n, count.containsKey(n) ? count.get(n) < 3 ? count.get(n) + 1 : count.get(n) + 0 : 1);
            // count.put(n,count.getOrDefault(n,0)+1);
            if (count.get(n) < 3) {
                countValue += 1;
                // value.add(n);
            }
        };

        // System.out.println("count==>" + count);
        return countValue;
    };

    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 2, 2, 3 };
        // removeDuplicates(a);
        System.out.println(removeDuplicates(a));
    }
}
