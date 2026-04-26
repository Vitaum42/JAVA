package ifandelse;

import java.util.Scanner;

public class Wat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] v = {1,2,3,4,5,6,7,8,9,10};
        int inicio = 0;
        int fim = v.length - 1;

        System.out.println("Digite um numero para procurar: ");
        int n = sc.nextInt();

        // JAVA é uma linguagem FORTEMENTE tipada // 
        for(int i = 0; i < v.length; i++) {
            if(n == v[i]){
                System.out.println("ACHEI O NUMERO ");
                System.out.println("Demorei " + i + " tentativas para encontrar");
                break;
            }
        }
        System.out.println();

        while(inicio <= fim) {
            int temp = v[inicio];
            v[inicio] = v[fim];
            v[fim] = temp;
            inicio++;
            fim--;
            System.out.println(temp);
        }

        
    }
}
