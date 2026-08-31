class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       ArrayList<Integer>list=new ArrayList<>();
       for(int x:nums){
        if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
        }else{
            map.put(x,1);
        }
       }
       for(int key:map.keySet()){
        if(map.get(key)==1){
            list.add(key);
        }
       } int m=list.size();
       int arr[]=new int[m];
       for(int i=0;i<m;i++){
        arr[i]=list.get(i);
       }return arr;
    }
}