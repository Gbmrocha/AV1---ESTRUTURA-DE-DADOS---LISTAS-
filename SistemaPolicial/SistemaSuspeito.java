import java.util.ArrayList;
import java.util.Scanner;

public class SistemaSuspeito {
    public static void main(String[] args) {
        int sim  = 0;
        ArrayList <String> perguntas = new ArrayList <String> ();
        perguntas.add("A: Telefonou para a vítima?");
        perguntas.add("B: Esteve no local do crime?");
        perguntas.add("C: Mora perto da vítima?");
        perguntas.add("D: Devia para a vítima?");
        perguntas.add("E: Já trabalhou com a vítima?");
        System.out.println("===== SISTEMA SUSPEITO ======");
        System.out.println("Responda as perguntas a seguir:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas.get(i)); 
            System.out.println("1 - SIM | 2 - Não");
            System.out.print("Resposta: ");
            if(new Scanner(System.in).nextInt() == 1){
                sim ++;
            }
            System.out.print("\n");
        }
        System.out.println("===== RESULTADO DO QUESTIONÁRIO =====");
        if(sim == 2){
            System.out.println("Suspeito!");
        }else if(sim == 3 || sim == 4){
            System.out.println("Cúmplice!");
        }else if(sim == 5){
            System.out.println("Assassino");
        }else{
            System.out.println("Inocente!");
        }
    }
}
