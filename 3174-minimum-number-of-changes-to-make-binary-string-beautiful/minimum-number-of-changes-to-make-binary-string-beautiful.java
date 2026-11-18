class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int i=0;
        int count=0;
       while(i<n){
            String p = s.substring(i,i+2 );
            
            if( p.charAt(0)!=p.charAt(1)){
                count++;

            }
            i+=2;

        }return count;
    }
}