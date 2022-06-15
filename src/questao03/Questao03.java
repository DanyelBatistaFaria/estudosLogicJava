package questao03;

import java.util.Scanner;

public class Questao03 {
    
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
            System.out.println("Digite número da sorte: ");
            int n = sc.nextInt();
            System.out.println("Número da sorte: " +n);

            String convEmChar = String.valueOf(n);
            String[] inpArray = convEmChar.split("");

            int meioDoArray = inpArray.length / 2;

            int n1 = 0;
            int n2 = 0;

            for(int i = 0 ; i < inpArray.length ; i++){
                if(i >= meioDoArray){
                    n1 += Integer.valueOf(inpArray[i]);
                }else{
                    n2 += Integer.valueOf(inpArray[i]);
                }

            }

            System.out.println("Valor de n1: " + n1 + " - " + "Valor de n2: "+ n2);

            if(n1 == n2){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
      
    }
}
