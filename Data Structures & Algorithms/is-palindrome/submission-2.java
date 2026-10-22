class Solution {
    public boolean isPalindrome(String s) {
         String normalized = s.toLowerCase().replaceAll("[^a-z0-9]", "");
         int i =  0;
         int j = normalized.length()-1;
         while(i<j){
            if(normalized.charAt(i)!=normalized.charAt(j)){
                return false;
            }
            i++;
            j--;
         }
         return true;
    }
}
