package AlunosAprovados;
import java.util.ArrayList;
public class ListAlunos{

    ArrayList <Aluno> alunos = new ArrayList <Aluno> ();

    public String addAluno(Aluno a){
        alunos.add(a);
        return "Aluno registrado";
    }

    public Aluno exibirAprovados(){
        Aluno a;
        for(int i = 0; i < alunos.size(); i++){
            a = alunos.get(i);
            if(a.getMedia() > 7.0){
                System.out.println(a);
            }
        }

        return null;
    }

    public Aluno exibirReprovados(){
        Aluno a;
        for(int i = 0; i < alunos.size(); i++){
            a = alunos.get(i);
            if(a.getMedia() < 7.0){
                System.out.println(a);
            }
        }

        return null;
    }
}