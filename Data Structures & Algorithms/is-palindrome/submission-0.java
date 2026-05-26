class Solution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            // Skip non-alphanumeric from left
            if(!Character.isLetterOrDigit(l)) {
                left++;
            }

            // Skip non-alphanumeric from right
            else if(!Character.isLetterOrDigit(r)) {
                right--;
            }

            // Compare characters
            else if(l != r) {
                return false;
            }

            // Move both pointers
            else {
                left++;
                right--;
            }
        }

        return true;
    }
}