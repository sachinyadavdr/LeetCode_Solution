class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>set=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]&&!set.contains(nums2[i])){
                    set.add(nums2[i]);
                
                }
            }
        }int arr[]=new int[set.size()];
        for(int i=0;i<set.size();i++){
            arr[i]=set.get(i);

        }
        return arr;
    }
}