public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[][] matrice = {{1, 2, 3, 4, 5},
                           {4, 5},
                           {7, 8, 9}};
//        System.out.println(matrice[2][2]);
//        System.out.println(matrice[1][0]);
//        System.out.println(matrice[0][4]);

//        String[][] strings = new String[3][4];
//        strings[0][1] = "Hello";
//        strings[1][3] = " ";
//        strings[2][3] = "World";
//        strings[0][3] = "!";
//        System.out.println(strings[0][1]+ strings[1][3]+ strings[2][3]+ strings[0][3]);

        for(int i=0;i<matrice.length; i++){
            for(int j =0; j< matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}
