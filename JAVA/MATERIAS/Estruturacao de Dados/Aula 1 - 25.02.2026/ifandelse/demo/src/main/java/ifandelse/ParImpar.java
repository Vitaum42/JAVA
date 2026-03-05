package main.java.ifandelse;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] v = new int[11];
        int numero,inicio, fim;
        for(int i = 0; i < 6; i++){
            System.out.println("Digite um numero para se posicionar no vetor: ");        
        }
        inicio = 0;
        fim = v.length - 1;

        while(inicio <= fim){
            numero = v[inicio];
            if(numero % 2 == 0){
            System.out.println("O numero " + numero + " é par");
            
        }else{
            System.out.println("O numero " + numero + " é impar");
        }
            
        }
    }
}

