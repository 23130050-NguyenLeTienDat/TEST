package lab3;

import java.util.Arrays;

public class Ex6 {
    //a) print matrix
    public void printMatrix(int[][] matrix){
        for(int i=0; i< matrix.length;i++){
            System.out.print("[");
            for(int j =0; j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println("]");
        }
    }

    //b) tam giac pascal
    public int[][] createPascalTriangle(int size){
        int[][] res = new int[size][0];
        for(int i=0;i<size;i++){
            res[i] = new int[i+1];
            res[i][0]=1;
            res[i][i]=i+1;
            for(int j=0;j<i;j++){
                res[i][j] =j+1;
            }
        }
        return  res;
    }
    //c
    public int[][] createPascalTriangle(int[] diagonalValues){
        int [][] res = new int[diagonalValues.length][];
        for(int i=0; i<diagonalValues.length;i++){
            res[i] = new int[i+1];
            res[i][i]=diagonalValues[i];
            for(int j=i-1; j>=0;j--){
                res[i][j]=res[i][j+1]-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6}
                };
        Ex6 ex6 = new Ex6();
        //a
        ex6.printMatrix(arr1);
        //b
        int[][] triangle = ex6.createPascalTriangle(5);
        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }
        //c
        System.out.println("cau 3 \n");
        int[] diagonalValues = {1,5,2,1};
        int[][] triangle2 = ex6.createPascalTriangle(diagonalValues);
        for (int[] row : triangle2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
