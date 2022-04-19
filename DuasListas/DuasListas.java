package DuasListas;

import java.util.ArrayList;
import java.util.Scanner;

public class DuasListas {
    private static ArrayList <Integer> listaValores1 = new ArrayList <Integer>();
    private static ArrayList <Integer> listaValores2 = new ArrayList <Integer>();
    private static ArrayList <Integer> listaValores3 = new ArrayList <Integer>();

    public static void main(String[] args) {
        Scanner entradaLista = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i + 1) + "º valor para a lista 1: ");
            int entrada1 = entradaLista.nextInt();
            listaValores1.add(entrada1);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Insira o " + (j + 1) + "º valor para a lista 2: ");
            int entrada2 = entradaLista.nextInt();
            listaValores2.add(entrada2);
        }

        entradaLista.close();
        
        System.out.println("Exibindo terceira lista: ");
        listaValores3.addAll(listaValores1);
        listaValores3.addAll(listaValores2);
        System.out.println(listaValores3);
    }
}
