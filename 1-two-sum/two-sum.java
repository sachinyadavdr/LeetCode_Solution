class Solution {
    public int[] twoSum(int[] arr, int target) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        map.put(arr[i],i);
     }
     for(int i=0;i<arr.length;i++){ 
     if(map.containsKey(target-arr[i])){
        int j=map.get((target-arr[i]));
       if(i!=j) return new int[]{i,j};

     }
     }return new int []{-1,-1};
    }
}