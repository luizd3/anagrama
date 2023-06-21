package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- VERIFICADOR DE ANAGRAMAS ------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a palavra 1: ");
        String palavra1 = scanner.next();
        System.out.print("Insira a palavra 2: ");
        String palavra2 = scanner.next();
        System.out.print("Comparando... ");
        if (Anagrama.ehAnagrama(palavra1, palavra2)) {
            System.out.println("São anagramas!");
        } else {
            System.out.println("Não são anagramas.");
        }
    }
}