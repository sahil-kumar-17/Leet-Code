class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character>myStack=new Stack<>();
        myStack.push(s.charAt(0));
        int score=0;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                myStack.push(c);
            }else{
                myStack.pop();
                if(s.charAt(i-1)=='('){
                    score+=(int)Math.pow(2,myStack.size());
                }
            }
        }
        return score;
    }
}