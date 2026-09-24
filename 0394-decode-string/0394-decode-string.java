class Solution {
    public String decodeString(String s) {
        Stack<Integer> multi = new Stack<>();
        Stack<StringBuilder> otherStuff = new Stack<>();
        StringBuilder currString = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            }else if(c=='['){
                multi.push(k);
                otherStuff.push(currString);
                currString=new StringBuilder();
                k=0;
            }else if(c==']'){
                int plier=multi.pop();
                StringBuilder temp=otherStuff.pop();
                for(int i=0;i<plier;i++){
                    temp.append(currString);
                }
                currString=temp;

            }else{
                currString.append(c);
            }

        }
        return currString.toString();
    }
}