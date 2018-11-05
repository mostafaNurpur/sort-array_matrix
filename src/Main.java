import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the row of the matrix");
        int row  = scan.nextInt();
        System.out.println("enter the col of the matrix");
        int col = scan.nextInt();

        int[][] matris = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                matris[i][j] = (int)(Math.random() *20) + 20;
            }
        }
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }


        System.out.println("Row ya Col baraye sort:");

        if (scan.next().equals("Row")){
            System.out.println("please choose your row");
            int R = scan.nextInt();

            for (int i = 0; i < row; i++) {
                for (int j = i + 1; j < col; j++)
                {
                    if (matris[i][R-1] > matris[j][R-1])
                    {

                        int[] temp = matris[i];
                        matris[i] = matris[j];
                        matris[j] = temp;

                    }
                }
            }
            System.out.println("output:");
            displayArray(matris);

        }
        if (scan.next().equals("Col")) {
            System.out.println("please choose your Col");
            int R = scan.nextInt();
            for (int i = 0; i < row; i++) {
                for (int j = i + 1; j < col; j++) {

                    if (matris[R - 1][i] > matris[R - 1][j]) {
                        int[] temp = matris[j];
                        matris[j] = matris[i];
                        matris[i] = temp;

                    }
                }
            }
            System.out.println("output:");
            displayArray(matris);
        }
        //Col run nemishe nemiidoonm chera :(

    }
    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}