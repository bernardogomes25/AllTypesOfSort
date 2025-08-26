import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = { 0, 33, 45, 83, 12, 5, 90, 11, 22 };

        System.out.println("\n Esta aplicação roda o seguinte vetor: " + Arrays.toString(vetor)
                + " e o ordena através do Selection Sort!\n");

        for (int i = 0; i < vetor.length - 1; i++) { //Percorre até o penúltimo índice
            int ponto = i; //Ponto de referência

            for (int j = i + 1; j < vetor.length; j++) { //Faz um ponto de referência auxiliar percorrer o vetor ao mesmo tempo
                if (vetor[j] < vetor[ponto]) { //Verifica se o próximo elemento é menor do que o ponto de referência atual
                    ponto = j; //Substitui o ponto de referência pelo menor elemento a partir dele
                }
            }

            int temp = vetor[i]; 
            vetor[i] = vetor[ponto]; //Faz a substituição do ponto de referência atual pelo elemento salvo
            vetor[ponto] = temp; 
        }

        System.out.println("\n Após a ordenação, ficamos com o seguinte vetor: " + Arrays.toString(vetor));
    }
}
