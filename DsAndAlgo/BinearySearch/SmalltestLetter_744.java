package BinearySearch;

public class SmalltestLetter_744 {

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'c';
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if (target > letters[end]) {
            // return letters[start];
            // }
            if (letters[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(letters[start] % letters.length);

    }
}
