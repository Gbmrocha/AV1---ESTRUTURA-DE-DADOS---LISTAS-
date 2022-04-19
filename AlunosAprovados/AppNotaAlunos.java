package AlunosAprovados;
import java.util.Scanner;

public class AppNotaAlunos {
    public static void main(String[] args) {
        String nome = "";
        double nota1 = 0.0, nota2 = 0.0, nota3 = 0.0, nota4 = 0.0, media = 0.0;
        ListAlunos list = new ListAlunos();
        Scanner scannerAluno = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            System.out.println("==== REGISTRO DE ALUNOS ====");
            System.out.println("Informe o nome do Aluno: ");
            nome = scannerAluno.nextLine();
            System.out.println("Informe a NOTA1: ");
            nota1 = scannerAluno.nextDouble();
            System.out.println("Informe a NOTA2: ");
            nota2 = scannerAluno.nextDouble();
            System.out.println("Informe a NOTA3: ");
            nota3 = scannerAluno.nextDouble();
            System.out.println("Informe a NOTA4: ");
            nota4 = scannerAluno.nextDouble();
            String escape = scannerAluno.nextLine();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println(list.addAluno(new Aluno(nome, nota1, nota2, nota3, nota4, media)));
        }
        
        System.out.println("==== LISTA APROVADOS ====");
        list.exibirAprovados();
        

        System.out.println("==== LISTA REPROVADOS ====");
        list.exibirReprovados();
        scannerAluno.close();
    }
}
