class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder tempStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                tempStr.append(Character.toLowerCase(c));
            }
        }
        return tempStr.toString().equals(tempStr.reverse().toString());
    }
}
