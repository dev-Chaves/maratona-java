package acadademy.devdojo.maratonajava.introducao;

public class Aula06FOr {
    public static void main (String[] main) {

        int[] idades = new int[3];
        int[] nums = {42, 7, 13, 99, 21};

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        // Ao fazer isso, você cria um novo espaço na memória, você nunca mais vai poder recuperar o anterior. O java limpa pelo garbage collector
        // Limpando os valores anteriores;

        // no primeiro for, nos vemos a primeira variável com o valor inicial inicializado,  depois todos valores são 0

        nums = new int[6];


        for (int i=0;i<nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
