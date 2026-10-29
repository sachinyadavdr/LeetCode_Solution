class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int l=0;
        int h=rows*cols-1;
        while(l<=h){
            int mid=(l+h);
            int rowmid=mid/cols;
            int colsmid=mid%cols;
            if(matrix[rowmid][colsmid]==target)return true;
            else if(matrix[rowmid][colsmid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }return false;
    }
}