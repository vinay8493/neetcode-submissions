class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        while(top <= bottom){
            int mid = (top+bottom)/2;
            if(target > matrix[mid][0] && target > matrix[mid][matrix[0].length-1]){
                top = mid+1;
            }else if(target < matrix[mid][0] && target < matrix[mid][matrix[0].length-1]){
                bottom = mid-1;
            }else{
                int l=0;
                int r=matrix[0].length-1;
                while(l <= r){
                    int mid2 = (l+r)/2;
                    if(target < matrix[mid][mid2]){
                        r = mid2-1;
                    }else if(target > matrix[mid][mid2]){
                        l = mid2+1;
                    }else{
                        return true;
                    }
                }

                return false;
            }
        }
        return false;
        
    }
}
