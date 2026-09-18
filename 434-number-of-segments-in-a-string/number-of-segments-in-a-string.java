class Solution {
    public int countSegments(String s) {
        String arr[]=s.trim().split("\\s+");
    if(s.trim().equals("")){
        return 0;
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        count++;
        System.out.println(arr[i]);
    }
      return count;
    }
}