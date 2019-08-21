/**
 * Author: Richard DiTullio Andrew Gingras
 * FileName: Queens.java
 *
 * This program checks the validity of the n-queens chess problem. It loops
 * reading in the location of each queen. For each queen added it will check if
 * a queen already exists in the row or column represented by a 1 in an array.
 * It will also check to see if another queen exists on the same diagonal as
 * the new queen also represented by a 1 in the array. If none exists a 1 will
 * be set for the usage index for row, column, and diagonal arrays. If a
 * placement is invalid the program will print out NO and terminate. Otherwise
 * if all queens are read in valid placements the program will print YES.
 */

import java.util.Scanner;

public class Queens {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] rowUsage = new int[n];
        int[] colUsage = new int[n];
        int[] rdigUsage = new int[n*2];
        int[] ldigUsage = new int[n*2];
        int row;
        int col;
        for(int a=0;a<n;a++){
            row = reader.nextInt() - 1;
            col = reader.nextInt() - 1;
            //column and row usage
            if((rowUsage[row] == 1) | (colUsage[col] == 1)){
                fail();
            }
            else {
                rowUsage[row] = 1;
                colUsage[col] = 1;
            }
            //Diagonal usage
            int rdig = (n - row) + col + 1;
            int ldig = row + col + 2;
            if((rdigUsage[rdig] == 1) | (ldigUsage[ldig] == 1)){
                fail();
            }
            else{
                rdigUsage[rdig] = 1;
                ldigUsage[ldig] = 1;
            }
        }
        System.out.println("YES");
    }


    private static void fail(){
        System.out.println("NO");
        System.exit(0);
    }
}