import java.util.*;
public class   pair{
    int row;
    int col;
    pair(int r,int c){
        this.row=r;
        this.col=c;
    }
}

class setmartixZeros{
    public  static void setZeroes(int[][] matrix) {
       ArrayList<pair> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                  list.add(new pair(i,j));
                }
            }
        } 
    for(int i=0;i<list.size();i++){
        int r=list.get(i).row;
        int c=list.get(i).col;
            for(int j=0;j<matrix[0].length;j++){
                matrix[r][j]=0;
            }
            for(int k=0;k<matrix.length;k++){
                matrix[k][c]=0;
            }
    }
    }
    public static void print(int [][]martix){
        for(int i=0;i<martix.length;i++){
            for(int j=0;j<martix[0].length;j++){
                System.out.print(martix[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
       int martix[][]={{1,1,1},{1,0,1},{1,1,1}};
      setZeroes(martix);
      print(martix);
    }
}