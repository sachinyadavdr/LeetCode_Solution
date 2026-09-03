class Solution {
    public String reverseWords(String s) {
        
        StringBuilder p=new StringBuilder();
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)== ' '){
                if(p.length()>0){
                list.add(p.toString());
                p.setLength(0);
                }
            }else{
                 p.append(s.charAt(i));
            }
           
            }if(p.length()>0){
               list.add(p.toString());

        }
         StringBuilder sb=new StringBuilder();
         for( int i=list.size()-1;i>=0;i--){
            sb.append(list.get(i));
            if(i!=0){
                sb.append(" ");
            }
         }
        
       
return sb.toString();
    }
}