//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m=matrix.length;
//        int n=matrix[0].length;
//        int s=Math.max(m,n);
//        int count=0;
//
//        // finding zero element
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(matrix[i][j]==0){
//                    count++;
//
//                    // for row making zero
//                    for(int k=0;k<n;k++){
//                        if(matrix[i][k]!=0){
//                            matrix[i][k]=-1;
//                        }
//                    }
//
//                    // for column making zero
//                    for(int l=0;l<m;l++){
//                        if(matrix[l][j]!=0){
//                            matrix[l][j]=-1;
//                        }
//                    }
//                }
//            }
//
//        }
//
//        // making all -1 to 0
//
//        if(count!=0){
//            for(int i=0;i<m;i++){
//                for(int j=0;j<n;j++){
//                    if(matrix[i][j]==-1){
//                        matrix[i][j]=0;
//                    }
//                }
//            }
//        }
//
//    }
//}