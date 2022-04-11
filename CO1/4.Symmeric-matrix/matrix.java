import java.util.*;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows of matrix");
        int row = sc.nextInt();
        System.out.println("Enter the no.of columns of matrix");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        int i , j;
        boolean state = true;
        for(i=0 ; i<row ; i++)
        {
            for(j=0 ; j<col ; j++)
            {
                System.out.println("Enter the  element at M("+i+" , "+j+")");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(i=0 ; i<row ; i++)
        {
            for(j=0 ; j<col ; j++)
            {
                if(matrix[i][j] != matrix[j][i])
                {
                    state = false;
                    break;

                }
            }

        }
        if(state)
        {
            System.out.println("Matrix is Symmetric");
        }
        else
        {
            System.out.println("Matrix is Antisymmetric");
        }
        
    }
}
