class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int m=t.length();
        int x=0;
        for(int i=0;i<n;i++){
                 x^=s.charAt(i);

            }
             for(int i=0;i<m;i++){
                 x^=t.charAt(i);

            }
            char p=(char)x;
            return p;
        
    }
}