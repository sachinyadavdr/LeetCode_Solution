class Solution {
    public int missingMultiple(int[] nums, int k) {
       
      HashSet<Integer> set=new HashSet<>();
      for(int x:nums){
        if(x%k==0){
            set.add(x);
        }
      }
      int m=k;

      while(set.contains(m)){
        m+=k;
      
      }return m;
    }
}