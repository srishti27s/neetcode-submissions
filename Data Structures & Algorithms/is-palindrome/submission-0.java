class Solution {
    public String isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9\\\\s]", "");
        System.out.println(cleanText);
    }
}
