class Solution {
    public int findNumbers(int[] nums) {
ArrayList<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int count=0;
            int x=nums[i];
            while(x!=0){
                int rem=x%10;
                count++;
                x/=10;
            }
              if(count%2==0){
            list.add(count);}
        }System.out.println(list);
       int c=0;
        for(int y:list){
          c++;
        }return c;
    }
}