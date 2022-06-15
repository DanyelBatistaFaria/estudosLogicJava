package questao02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {

    public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
            ArrayList<String> inputArray = new ArrayList<>(Arrays.asList(new String[6]));
            ArrayList<String> arrayAux = new ArrayList<String>();
            System.out.println("Digite palavras: ");
            for (int i = 0; i < inputArray.size(); i++) {

                inputArray.set(i, sc.nextLine());

            }

            int maiorFrase = 0;

            for (int i = 0; i < inputArray.size(); i++) {
                int frase = inputArray.get(i).length();

                if (frase > maiorFrase) {
                    maiorFrase = frase;

                }

            }
            for(int i = 0; i < inputArray.size() ; i++){

                int frase = inputArray.get(i).length();

                if (frase == maiorFrase){
                    arrayAux.add(inputArray.get(i));

                }

            }
            System.out.println("Quantidade da maior palavra: " + maiorFrase);
            System.out.println("Array com maiores palavra: " + arrayAux);
        }

}
