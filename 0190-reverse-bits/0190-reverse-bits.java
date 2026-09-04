class Solution {
    public int reverseBits(int n) {
        StringBuilder s=new StringBuilder(Integer.toBinaryString(n));
        s.reverse();
        while(s.length()<Integer.SIZE){
            s.append(0);
        }
        String res=s.toString();
        System.out.println(res);
        return Integer.parseInt(res,2);
    }
}