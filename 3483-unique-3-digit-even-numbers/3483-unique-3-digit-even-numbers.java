class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>myset=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j||i==k||k==i||k==j){
                        continue;
                    }
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0){
                        myset.add(num);
                    }
                }
            }
        }
        return myset.size();
    }
}