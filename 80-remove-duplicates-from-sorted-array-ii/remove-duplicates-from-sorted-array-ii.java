class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           list.add(nums[i]);
        } 
        for(int i=0;i<list.size()-2;i++){
            if(list.get(i).equals(list.get(i+2))){
                list.remove(i+2);
                i--;
                
            
            }
        } int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
           nums[i]=list.get(i);
        }
        
        return list.size();
    }
}