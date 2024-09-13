package claracaio.q1;

import java.util.Scanner;

public class CLARACAIONICOLASQ1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de pessoas: ");
            int quantidadePessoas = input.nextInt();
            input.nextLine(); // Limpar o buffer
            
            String[] nomes = new String[quantidadePessoas];
            
            for (int i = 0; i < quantidadePessoas; i++) {
                System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                nomes[i] = input.nextLine();
            }
            
            System.out.print("Digite o número do nome que você gostaria de consultar: ");
            int posicao = input.nextInt() - 1; // Considerando a posição inicial como 1
            
            if (posicao >= 0 && posicao < quantidadePessoas) {
                System.out.println("O nome na posição " + (posicao + 1) + " é: " + nomes[posicao]);
            } else {
                System.out.println("Consulta inválida. Por favor, insira um número dentro do intervalo de 1 a " + quantidadePessoas);
            }
        }
    }
}
