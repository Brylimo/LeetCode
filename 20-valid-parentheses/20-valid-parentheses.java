class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] array;
        boolean result = true;
        
        array = s.toCharArray();
        
        if (array.length == 1) result = false;
        if (array[0] == ')' || array[0] == ']' || array[0] == '}') return false;
        
        for (int i = 0; i < array.length; i++) {
            char top = array[i];
            if (top == '(' || top == '[' || top == '{') {
                stack.push(top);
            } else {
                if (top == ')') {
                    if (!stack.empty()) {
                        char pp = stack.pop();
                        if (pp != '(') {
                            result = false;
                            break;
                        }
                    } else {
                        result = false;
                        break;
                    }
                } else if (top == ']') {
                    if (!stack.empty()) {
                        char pp = stack.pop();
                        if (pp != '[') {
                            result = false;
                            break;
                        }
                    } else {
                        result = false;
                        break;
                    }
                } else if (top == '}') {
                    if (!stack.empty()) {
                        char pp = stack.pop();
                        if (pp != '{') {
                            result = false;
                            break;
                        }
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        
        if(!stack.empty()) { result = false; }
        
        return result;
    }
}