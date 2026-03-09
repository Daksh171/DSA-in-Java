public class search_2D_II {
     public static  boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        
        while(left<m && right>=0){
             int curr=matrix[left][right];
            if(curr==target){
                return true;
            }
            else if(curr<target){ 
                left++;   
            }
            else{  
             right--;
            }
        }
        return false;  
    }   
   public static void main(String[] args) {
    int[][] matrix = {
        {1,4},{2,5}
};

int target = 2;
    System.out.println(matrix[0][matrix[0].length-1]);
System.out.println(searchMatrix(matrix, target));
   }
}
