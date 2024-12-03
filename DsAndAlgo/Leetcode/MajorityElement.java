// import java.util.Collections;
// import java.util.Comparator;
// import java.util.HashMap;
// import java.util.Map;

// public class MajorityElement {

//     public static void main(String[] args) {
//         int[] nums = { 1 };
//         System.out.println(majorityElement(nums));
//     }

//     public static int majorityElement(int[] nums) {
//         if(nums.length == 0)
//             return nums[0];
//         int start = 0;
//         int end = nums.length - 1;
        
//         Map<Integer, Integer> value = new HashMap<>();

//         while (start < end) {
//             System.out.println("start" + start + "end" + end);
//             value.put(nums[start], value.getOrDefault(nums[start], 0) + 1);
//             if(start != end)
//                 value.put(nums[end], value.getOrDefault(nums[end], 0) + 1);
//             start++;
//             end--;
//         }
//         ;
//         System.out.println(value);
//         // Integer maxValue = value.values().stream().max(Comparator.naturalOrder()).orElse(null);

//         Integer maxValue = Collections.max(value.entrySet(),Map.Entry.comparingByValue()).getKey();
//         return maxValue.intValue();
//     }

// }


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = { 1 };
        System.out.println(majorityElement(nums));  // This should print 1
    }

    public static int majorityElement(int[] nums) {
        // Handle edge case where the array is empty
        if (nums.length == 0)
            throw new IllegalArgumentException("Input array cannot be empty");

        int start = 0;
        int end = nums.length - 1;
        
        // Map to store frequencies of elements
        Map<Integer, Integer> value = new HashMap<>();

        // Handle the loop for arrays with a single element
        while (start <= end) {  // Use <= to ensure the loop works when start == end
            value.put(nums[start], value.getOrDefault(nums[start], 0) + 1);
            if (start != end) {  // Avoid adding the same element twice when start == end
                value.put(nums[end], value.getOrDefault(nums[end], 0) + 1);
            }
            start++;
            end--;
        }

        // Find the key with the highest frequency in the map
        Integer maxValue = Collections.max(value.entrySet(), Map.Entry.comparingByValue()).getKey();
        return maxValue;  // Return the majority element
    }
}
