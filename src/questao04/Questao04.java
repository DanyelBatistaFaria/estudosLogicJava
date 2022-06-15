package questao04;

public class Questao04 {

    public static void main(String[] args) {

        int soma = 0;

        int[][] matriz = new int[3][4];

        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 1;
        matriz[0][3] = 2;

        matriz[1][0] = 0;
        matriz[1][1] = 5;
        matriz[1][2] = 0;
        matriz[1][3] = 0;

        matriz[2][0] = 2;
        matriz[2][1] = 0;
        matriz[2][2] = 3;
        matriz[2][3] = 3;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == 0) {
                    for (int k = i + 1; k < matriz.length; k++) {
                        matriz[k][j] = 0;
                    }

                }

            }

        }

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(" { " + matriz[x][y] + " } ");

                soma += matriz[x][y];

            }
            System.out.println();
        }

        System.out.println("Valor: " + soma);

    }

}
