class Solution {
    public String shortestPalindrome(String s) {
        final String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < t.length(); ++i)
            if (s.startsWith(t.substring(i)))
                return t.substring(0, i) + s;

        return t + s;
    }
}
public class Shortest_Palindrome_214 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String case1 = "aacecaaa";
        String case2 = "aacecaaa";
        System.out.println(solution.shortestPalindrome(case1));
        System.out.println(solution.shortestPalindrome(case2));;
    }
}
