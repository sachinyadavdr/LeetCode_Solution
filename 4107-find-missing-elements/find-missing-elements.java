class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int small=nums[0];
        int big=nums[n-1];
        int ind=0;
        for(int i= small;i<big;i++){
            if(nums[ind]==i){
                ind++;
            }else{
                list.add(i);
            }

        }return list;

    }
}