public class LongestSubNoDup {
    public static void main(String[] args) {
        String str = "arabcacfr";

        System.out.print(longestSubLength(str));
    }

	public static int longestSubLength(String str) {
        int maxLength = 0;
        int curLength = 0;

        int[] position = new int[26];
        for (int i = 0; i < 26; i++) {
            position[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int preIndex = position[a - 'a'];
            if (preIndex < 0|| i - preIndex > curLength) {
                curLength++;
            } else {
                maxLength = Math.max(maxLength, curLength);
                curLength = i - preIndex;
            }
            position[a - 'a'] = i;
        }
        
        maxLength = Math.max(maxLength, curLength);
        return maxLength;
	}
}