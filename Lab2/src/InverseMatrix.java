import java.util.Random;

public class InverseMatrix
{
    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);
        double[][] matrix = new double[size][size];
        Random rand = new Random();
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                matrix[i][j] = rand.nextDouble();
            }
        }
        double[][] inverseMatrix = invert(matrix);
        System.out.println("Оригiнальна матриця:");
        printMatrix(matrix);
        System.out.println("\nОбернена матриця:");
        printMatrix(inverseMatrix);
    }

    private static double[][] invert(double[][] matrix)
    {
        int size = matrix.length;
        double[][] aMatrix = new double[size][2*size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                aMatrix[i][j] = matrix[i][j];
                aMatrix[i][j+size] = (i == j) ? 1.0 : 0.0;
            }
        }
        for (int i = 0; i < size; i++)
        {
            double p = aMatrix[i][i];
            for (int j = 0; j < 2*size; j++)
            {
                aMatrix[i][j] /= p;
            }
            for (int j = 0; j < size; j++)
            {
                if (i != j)
                {
                    double r = aMatrix[j][i];
                    for (int k = 0; k < 2*size; k++)
                    {
                        aMatrix[j][k] -= r * aMatrix[i][k];
                    }
                }
            }
        }
        double[][] inverseMatrix = new double[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                inverseMatrix[i][j] = aMatrix[i][j+size];
            }
        }
        return inverseMatrix;
    }
    private static void printMatrix(double[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
