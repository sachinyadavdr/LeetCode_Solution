class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:nums){
        if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
        }else{
            map.put(x,1);
        }
    } 
    for(int key:map.keySet())  {
        if(map.get(key)==1){
            return key;
        }
    }return -1;  
    }
}