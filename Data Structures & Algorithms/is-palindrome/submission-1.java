class Solution {
    public boolean isPalindrome(String s) {
        String normalized = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder copy = new StringBuilder(normalized);
        copy.reverse();
        return normalized.equals(copy.toString());

    }
}
