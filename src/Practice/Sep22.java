package Practice;

public class Sep22 {
    public static void main(String[] args) {
        lexoAlpha(freq("apple"), "", "apple".length());
    }

    private static int[] freq(String line){
        int[] nums = new int[26];
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            nums[ch-'a']++;
        }
        return nums;
    }

    private static void lexoAlpha(int[] count, String processed, int target){
        if (processed.length() == target){
            if (processed.compareTo("apple") < 0){
                System.out.println(processed);
            }
            return;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0){
                count[i]--;
                lexoAlpha(count, processed + (char)('a' + i), target);
                count[i]++;
            }
        }
    }
}
