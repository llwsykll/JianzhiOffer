public class GetTranslationCount{
    public static void main(String[] args) {
        int num = 12258;
        System.out.println(getTranslationCount(num));
    }

    public static int getTranslationCount(int num) {
        char[] str = Integer.valueOf(num).toString().toCharArray();

        int len = str.length;
        
        int[] counts = new int[len];
        int count = 0;

        for (int i = len - 1; i >= 0; i--) {
            count = 0;
            if (i < len - 1) {
                count = counts[i+1];
            } else {
                count = 1;
            }

            if (i < len - 1) {
                int di = str[i] - '0';
                int d2 = str[i + 1] - '0';
                int convert = di * 10 + d2;
                if (convert >= 10 && convert <= 25) {
                    if (i < len - 2) {
                        count += counts[i + 2];
                    } else {
                        count += 1;
                    }
                }
            }
            counts[i] = count;
        }

        return counts[0];
    }
}