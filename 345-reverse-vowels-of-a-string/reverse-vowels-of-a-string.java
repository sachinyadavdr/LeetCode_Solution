class Solution {
    public String reverseVowels(String p) {
        int l=0;
        
        char[] s=p.toCharArray();
        int r=s.length-1;
        while(l<=r){
        while(l<r   && 
        s[l] != 'A' &&
      s[l] != 'E' &&
      s[l] != 'I' &&
      s[l] != 'O' &&
      s[l] != 'U' &&
      s[l] != 'a' &&
      s[l] != 'e' &&
      s[l] != 'i' &&
      s[l] != 'o' &&
      s[l] != 'u'){
                l++;
            }
            while(l<r && 
            s[r]!='A'
            &&s[r]!='E'
            &&s[r]!='I'&&
            s[r]!='O'&&s[r]!='U'&&
            s[r]!='a'&&s[r]!='e'&&s[r]!='i'&&
             s[r]!='o'&&s[r]!='u'){
                r--;
            }
            char tem=s[l];
            s[l]=s[r];
            s[r]=tem;
            l++;
            r--;}
        
        return new String(s);
    }
}