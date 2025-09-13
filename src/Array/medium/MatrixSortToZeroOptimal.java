//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m=matrix.length;
//        int n=matrix[0].length;
//        // rowFirst= matrix[...][0]
//        // colFirst =matrix =[0][....]
//
//        // tracking zero element
//        int col=1;
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(matrix[i][j]==0){
//                    matrix[i][0]=0;
//                    if(j!=0){
//                        matrix[0][j]=0;
//                    }else{
//                        col=0;
//                    }
//
//                }
//            }
//        }
//        // making rest of row and col zero
//        for(int i=1;i<m;i++){
//            for(int j=1;j<n;j++){
//                if(matrix[i][0]==0 || matrix[0][j]==0){
//                    matrix[i][j]=0;
//                }
//            }
//        }
//        // handling first row and col
//        if(matrix[0][0]==0){
//            for(int j=0;j<n;j++){
//                matrix[0][j]=0;
//            }
//        }
//
//        if(col==0){
//            for(int i=0;i<m;i++){
//                matrix[i][0]=0;
//            }
//        }
//    }
//}