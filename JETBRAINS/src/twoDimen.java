package src;

import java.util.Scanner;

class TwoDimen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String[][] matrix = new String[num][num];
        int semiLength = num / 2;

        for (int a = 0; a < num; a++) {
            matrix[semiLength][a] = "*";
            matrix[a][semiLength] = "*";
        }

        for (int b = 0; b < semiLength; b++) {
            for (int c = 0; c < semiLength; c++) {
                if(c == b){
                    matrix[b][c] = "*";
                }
                else{
                    matrix[b][c] = ".";
                }
            }
        }

        for (int d = num - 1; d > semiLength; d--) {
            for (int e = 0; e < semiLength; e++) {
                if(e + d == num - 1){
                    matrix[d][e] = "*";
                }
                else{
                    matrix[d][e] = ".";
                }
            }
        }

        for (int f = 0; f < semiLength; f++) {
            for (int g = num - 1; g > semiLength; g--) {
                if(f + g == num - 1){
                    matrix[f][g] = "*";
                }
                else{
                    matrix[f][g] = ".";
                }
            }
        }

        for (int h = num - 1; h > semiLength; h--) {
            for (int i = num - 1; i > semiLength; i--) {
                if(i == h){
                    matrix[h][i] = "*";
                }
                else{
                    matrix[h][i] = ".";
                }
            }
        }

        for(String[] array : matrix){
            for(String element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        input.close();
    }
}