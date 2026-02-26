package ifandelse;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        a = sc.nextInt();

        System.out.println("Digite outro número:");
        b = sc.nextInt();

        System.out.println("Digite o último número:");
        c = sc.nextInt();
        
        
        if(a <= b) {
            System.out.println( b + "\n" + a);
        }else{
            System.out.println(a + "\n" + b);
        }
        if(b <= c) {
            System.out.println(c + "\n" + b);
        }else{
            System.out.println(b + "\n" + c);
        }

        




    }
    
    
}