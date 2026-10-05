class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>myStack=new Stack<>();
        myStack.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                myStack.push(0);
            }else{
                int inner=myStack.pop();
                int score=inner==0?1:2*inner;
                myStack.push(myStack.pop()+score);
            }
        }
        return myStack.pop();
    }
}