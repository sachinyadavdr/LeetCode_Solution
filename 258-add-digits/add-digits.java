class Solution {
    public int addDigits(int num) {
        while(num>9){int x=0;
      while(num>0){
        int p=num%10;
        x+=p;
        num/=10;
      }
      num=x;
        }
        return num;
    }
}