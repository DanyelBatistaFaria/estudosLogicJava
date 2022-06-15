package questao06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> filaArray = new ArrayList<>(Arrays.asList(new Integer[5]));
        System.out.println("Digite o peso das pessoas: ");
        ArrayList<Integer> arrayAux = new ArrayList<>(Arrays.asList(new Integer[2]));
       Collections.fill(arrayAux, 0);
        for (int i = 0; i < filaArray.size(); i++) {
            filaArray.set(i, sc.nextInt());

        }

        for(int i = 0; i < filaArray.size(); i++){
            System.out.println(i);

            if(i % 2 == 0){
               // System.out.println("Somando impar: " + arrayAux.get(0));
                arrayAux.set(0 , arrayAux.get(0) + filaArray.get(i));
                System.out.println("Somando impar: " + filaArray.get(i));

            }else{
              //  System.out.println("Somando par: " + arrayAux.get(1));
                arrayAux.set(1 , arrayAux.get(1) + filaArray.get(i));
                System.out.println("Somando par: " + filaArray.get(i));

            }

        }
        System.out.println("Resultado: " + arrayAux);
    }

}
