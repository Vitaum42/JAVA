package ifandelse;

public class BuscaSequencial {
    public static void main(String[] args){
        int[] v ={1,2,3,4,5,6,7,8,9,10};
        int inicio = 0;
        int fim = v.length - 1;
        int search = 3;

        for(int i = 0; i <= fim; i++){
            if(v[i] == search){
                System.out.println("ACHOOOOOOOOO");
                break;
            }
        }
    }
}
