package questao01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Questao01 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<>(Arrays.asList(new Integer[6]));
        System.out.println("Digite uma sequencia de números: ");
        ArrayList<Integer> arrayAux = new ArrayList<>(Arrays.asList(new Integer[2]));
        Collections.fill(arrayAux, 0);

        for (int i = 0; i < inputArray.size(); i++) {

            inputArray.set(i, sc.nextInt());

        }
        int valorDoMaiorProduto = -2147483648;

        for (int i = 0; i < inputArray.size() - 1; i++) {

            int produto = inputArray.get(i) * inputArray.get(i + 1);

            if (produto > valorDoMaiorProduto) {

                valorDoMaiorProduto = produto;
                arrayAux.set(0, arrayAux.get(0) + inputArray.get(i));

            }
        }
        System.out.println("Array: " + inputArray);
        System.out.println("Valor do maior produto: " + valorDoMaiorProduto);
    }
}
