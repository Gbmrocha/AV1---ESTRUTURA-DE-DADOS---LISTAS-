package ListaNumeros;

import java.util.ArrayList;

public class ListaNumeros{

    ArrayList <Integer> listaNumeros = new ArrayList <Integer> ();
    ArrayList <Integer> par = new ArrayList <Integer> ();
    ArrayList <Integer> impar = new ArrayList <Integer> ();

    public String addNumber(Integer n){
        listaNumeros.add(n);
        return "Valor adicionado";
    }

    public void show(){
        for (Integer i : listaNumeros) {
            System.out.println(i);
        }
    }

    public int isPar(){
        for( int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 == 0){
                par.add(listaNumeros.get(i));
            }
        }
        return 0;
    }

    public void showPar(){
        for (Integer i : par) {
            System.out.println(i);
        }
    }

    public int isImpar(){
        for( int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) % 2 != 0){
                impar.add(listaNumeros.get(i));
            }
        }
        return 1;
    }

    public void showImpar(){
        for (Integer i : impar) {
            System.out.println(i);
        }
    }
}