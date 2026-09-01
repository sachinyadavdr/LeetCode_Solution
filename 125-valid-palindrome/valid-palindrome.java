class Solution {
    public boolean isPalindrome(String s) {
       String result=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       String l=result;
       StringBuilder t=new StringBuilder ();
       for(int i=l.length()-1;i>=0;i--){
       char p=l.charAt(i);
        t.append(p);
       }
       String k=t.toString().toLowerCase();
       System.out.println(k);
       if(result.equals(k)){
        return true;
       }
       return false;
    }
}