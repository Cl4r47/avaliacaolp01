/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = input.nextInt();
        input.nextLine(); // Limpar o buffer

        Map<String, String> bancoTelefones = new HashMap<>();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = input.nextLine();
            System.out.print("Digite o telefone da pessoa " + nome + ": ");
            String telefone = input.nextLine();
            bancoTelefones.put(nome, telefone);
        }

        System.out.print("Digite o nome da pessoa que deseja consultar o telefone: ");
        String nomeConsulta = input.nextLine();

        if (bancoTelefones.containsKey(nomeConsulta)) {
            String telefoneConsulta = bancoTelefones.get(nomeConsulta);
            System.out.println("O telefone de " + nomeConsulta + " é: " + telefoneConsulta);
        } else {
            System.out.println("O nome informado não está no banco de dados.");
        }

        input.close();
    
    }
    
}
