/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package workshop1;

/**
 *
 * @author Nguyen Hoang Minh
 */
import java.util.Scanner;
public class part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row;
        int column;
        int[][] matrix;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Number of row: ");
        row=input.nextInt();
        System.out.print("Number of column: ");
        column=input.nextInt();
        matrix=new int[row][column];
        System.out.print("Enter Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("\nmatrix["+i+"]["+j+"]= ");
                matrix[i][j]=input.nextInt();
                sum+=matrix[i][j];
            }
        }
        System.out.println("Matrix Inputted: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Sum= "+sum);
        System.out.println("Average= "+ ((float)sum/(row*column)));
    }
    
}
