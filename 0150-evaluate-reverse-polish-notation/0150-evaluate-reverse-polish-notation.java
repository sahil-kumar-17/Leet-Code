class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>myStack=new Stack<>();
        String operators="+-*/";
        for(String s:tokens){
            if(operators.indexOf(s)!=-1){
                int n1=myStack.pop();
                int n2=myStack.pop();
                if(s.equals("+")){
                    myStack.push(n1+n2);
                }else if(s.equals("-")){
                    myStack.push(n2-n1);
                }else if(s.equals("*")){
                    myStack.push(n1*n2);
                }else if(s.equals("/")){
                    myStack.push(n1!=0?n2/n1:0);
                }
            }else{
                myStack.push(Integer.parseInt(s));
            }
        }
        return myStack.pop();
    }
}