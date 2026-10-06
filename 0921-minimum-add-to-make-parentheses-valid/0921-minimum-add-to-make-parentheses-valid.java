class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>myStack=new Stack<>();
        int oc=0;
        int cc=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                myStack.push(c);
            }else if(!myStack.isEmpty()&&myStack.peek()=='('){
                myStack.pop();
                oc=oc>0?oc--:0;
            }else{
                cc++;
            }
        }
        while(!myStack.isEmpty()){
            oc++;
            myStack.pop();
        }
        return oc+cc;
    }
}