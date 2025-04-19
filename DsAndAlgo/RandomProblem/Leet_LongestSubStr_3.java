package RandomProblem;

public class Leet_LongestSubStr_3 {

    public static void main(String[] args) {

        String s = "pwwkew";
//        String s= "aab";
//        String s = "dvdf";
        int result = secondTry(s);
//        System.out.println("result==> "+result);


        StringBuilder str = new StringBuilder();

        int first = 0;
        int second = 1;
        int count = 1;
        str.append(s.charAt(first));
//        int totalCount = 0;
//        String s1 = String.valueOf(s.charAt(0));

        while (second < s.length()) {
//            if (str.toString().contains(String.valueOf(s.charAt(first)))) {
            if(s.charAt(first) == s.charAt(second)){
                str.delete(0, str.length());
                first++;
                str.append(s.charAt(first));
//                count = 0;
//                str.append(s.charAt(first));
//                count++;
            }
//            else {
                str.append(s.charAt(second));
//                count++;

//            }
//            first++;
//            count++;
            count = Math.max(count, str.length());
            second++;

        }

        System.out.println("count==> "+count);
    }

    static int secondTry(String s){
//        int first = 0;
        int second = 0;
        int maxLength = 0;
        StringBuilder str = new StringBuilder();

        while (second < s.length()) {
            char currentChar = s.charAt(second);

            // If the character already exists in the current substring
            int index = str.indexOf(String.valueOf(currentChar));
            if (index != -1) {
                // Remove all characters up to and including the duplicate
                str.delete(0, index + 1);
            }

            str.append(currentChar);
            maxLength = Math.max(maxLength, str.length());
            second++;
        }

        System.out.println("Longest length: " + maxLength);
        return maxLength;
    }
}
