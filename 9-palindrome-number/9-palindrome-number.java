class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] reverse = new char[number.length()];
        for (int i = 0, j = number.length() - 1; i < number.length(); i++, j--) {
            reverse[i] = number.charAt(j);
        }
        
        return String.valueOf(reverse).equals(number);
    }
}