        while(inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (v[meio] == n) {
                System.out.println("ACHEI O NUMERO");
                System.out.println("Demorei " + (meio + 1) + " tentativas para encontrar");
                break;
            } else if (v[meio] < n) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }