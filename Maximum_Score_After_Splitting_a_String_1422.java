public class Maximum_Score_After_Splitting_a_String_1422 {
    public static void main(String[] args) {
        System.out.println(maxScore("011101")); //test1 = 5
        System.out.println(maxScore("00111")); //test2 = 5
        System.out.println(maxScore("1111")); //test3 = 3
    }

    //https://leetcode.com/problems/maximum-score-after-splitting-a-string/?envType=daily-question&envId=2025-01-01

    public static int maxScore(String s) {
        int left = 0, right = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '1') {
                right++;
            }
        }
        int result = 0;
        for (int i = 0; i < n - 1; ++i) {
            left += (s.charAt(i) - '0') ^ 1;
            right -= s.charAt(i) - '0';
            result = Math.max(result, left + right);
        }
        return result;
    }
}
