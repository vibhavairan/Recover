import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temppp {

    // Function to preprcess input mat[M][N].
    // This function mainly fills aux[M][N]
    // such that aux[i][j] stores sum of
    // elements from (0,0) to (i,j)
    static int preProcess(int mat[][], int aux[][], int N, int M)
    {

        // Copy first row of mat[][] to aux[][]
        for(int i = 0; i < N; i++)
            aux[0][i] = mat[0][i];

        // Do column wise sum
        for (int i = 1; i < M; i++)
            for (int j = 0; j < N; j++)
                aux[i][j] = mat[i][j] +
                        aux[i-1][j];

        // Do row wise sum
        for (int i = 0; i < M; i++)
            for (int j = 1; j < N; j++)
                aux[i][j] += aux[i][j-1];

        return 0;
    }

    // A O(1) time function to compute sum
    // of submatrix between (tli, tlj) and
    // (rbi, rbj) using aux[][] which is
    // built by the preprocess function
    static int sumQuery(int aux[][], int tli,
                        int tlj, int rbi, int rbj)
    {

        // result is now sum of elements
        // between (0, 0) and (rbi, rbj)
        int res = aux[rbi][rbj];

        // Remove elements between (0, 0)
        // and (tli-1, rbj)
        if (tli > 0)
            res = res - aux[tli-1][rbj];

        // Remove elements between (0, 0)
        // and (rbi, tlj-1)
        if (tlj > 0)
            res = res - aux[rbi][tlj-1];

        // Add aux[tli-1][tlj-1] as elements
        // between (0, 0) and (tli-1, tlj-1)
        // are subtracted twice
        if (tli > 0 && tlj > 0)
            res = res + aux[tli-1][tlj-1];

        return res;
    }

    // Driver code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int aux[][] = new int[row1][col1];
        for (int i = 0; i < row1; i++)
        {
            for (int j = 0; j < col1; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        preProcess(mat, aux, row1, col1);

        int tli = 2, tlj = 2, rbi = 3, rbj = 4;
        System.out.print("\nQuery1: "
                + sumQuery(aux, tli, tlj, rbi, rbj));

        tli = 0; tlj = 0; rbi = 1; rbj = 1;
        System.out.print("\nQuery2: "
                + sumQuery(aux, tli, tlj, rbi, rbj));

        tli = 1; tlj = 2; rbi = 3; rbj = 3;
        System.out.print("\nQuery3: "
                + sumQuery(aux, tli, tlj, rbi, rbj));
    }
}
