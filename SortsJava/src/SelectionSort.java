import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] vetor = { 0, 33, 45, 83, 12, 5, 90, 11, 22 };

        System.out.println("\n Esta aplicação roda o seguinte vetor: " + Arrays.toString(vetor)
                + " e o ordena através do Selection Sort!\n");

        for (int i = 0; i < vetor.length - 1; i++) {
            int ponto = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[ponto]) {
                    ponto = j;
                }
            }

            int temp = vetor[i];
            vetor[i] = vetor[ponto];
            vetor[ponto] = temp;
        }

        System.out.println("\n Após a ordenação, ficamos com o seguinte vetor: " + Arrays.toString(vetor));
    }
}
