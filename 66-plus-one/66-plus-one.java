class Solution {
    public int[] plusOne(int[] digits) {
        boolean plusOne = false;
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i != digits.length - 1 && !plusOne) continue;
            plusOne = false;
            
            if (digits[i] == 9) {
                digits[i] = 0;
                plusOne = true;
                if (i == 0) {
                    result[0] = 1;
                    for (int j = 1, k = 0; j < result.length; j++, k++) {
                        result[j] = digits[k];
                    }
                    return result;
                }
            } else {
                digits[i] += 1;
            }
        }
        
        return digits;
    }
}