package  main.java.ifandelse;

import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, meio;

        System.out.println("Digite o numero para procurar: ");
        int n = sc.nextInt();

        int [] v = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        inicio = 0;
        fim = v.length - 1;
        boolean achou = false; // tipo de variável para verdadeiro e falso (true|false)

        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            if(n == v[meio]) {
                achou = true;
                break;
            }else{
                fim = meio - 1;
            }
        }
            
        if(achou) {
            System.out.println("ACHEI O NUMERO");
        }else {
            System.out.println("NAO ACHEI O NUMERO");        }
    }
}