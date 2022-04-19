package ListaNumeros;
import java.util.Scanner;

// { Aluno: Gabriel Barreto Medeiros Rocha }

public class ListNum {
    public static void main(String[] args) {
        int i = 0;
        int valor = 0;
        
        ListaNumeros list = new ListaNumeros();
        

        Scanner sc = new Scanner(System.in);

        for (i = 0; i <= 19; i++) {
            System.out.println("Informe um valor: ");
            valor = sc.nextInt();
            System.out.println(list.addNumber(valor));
            System.out.println("=====================");       
        }
        
        sc.close();

        System.out.println("===== Lista com todos os valores =====");
        list.show();

        System.out.println("===== Lista com todos os valores pares =====");
        list.isPar();
        list.showPar();

        System.out.println("===== Lista com todos os valores impares =====");
        list.isImpar();
        list.showImpar();

    }
}
