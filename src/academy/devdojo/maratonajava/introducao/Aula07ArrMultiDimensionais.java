package acadademy.devdojo.maratonajava.introducao;

public class Aula07ArrMultiDimensionais {
    public static void main(String[] args){

        // Arrays multidimensionais, navegar em arrays dentro de arrays, quase um for dentro de for

        int[][] mes = new int[2][2];

        for (int i = 0; i < mes.length; i++) {
            for (int j = 0; j < mes.length; j++) {
                System.out.println(mes[i][j]);
            }
        }

    }
}
