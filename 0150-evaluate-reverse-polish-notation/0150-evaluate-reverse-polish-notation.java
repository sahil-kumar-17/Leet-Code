class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack();
        int op1 = 0;
        int op2 = 0;
        int res = 0;
        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                myStack.push(Integer.parseInt(s));
            }
            if (s.equals("+")) {
                op1 = myStack.pop();
                op2 = myStack.pop();
                res = op1 + op2;
                myStack.push(res);
            } else if (s.equals("-")) {
                op1 = myStack.pop();
                op2 = myStack.pop();
                res = op2-op1;
                myStack.push(res);
            } else if (s.equals("*")) {
                op1 = myStack.pop();
                op2 = myStack.pop();
                res = op1 * op2;
                myStack.push(res);
            } else if (s.equals("/")) {
                op1 = myStack.pop();
                op2 = myStack.pop();
                res = op1!=0?op2/op1:0;
                myStack.push(res);
            }
        }
        return myStack.pop();
    }
}