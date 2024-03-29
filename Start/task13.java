package Start;

public class task13 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,4}, 
                            {3,5,9}, 
                            {2,5,1}};
        // System.out.println(matrix[0][0]);

        // String [][] str = new String[2][3];
        // str[1][1] = "Hello Igor";
        // System.out.println(str[1][1]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
