package ComparativoCarros;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class ComparativoCarros {
    public static void main(String[] args) {
        int economico = 0;
        double comparativo = Double.MIN_VALUE;
        ArrayList <String> carros = new ArrayList <String> ();
        ArrayList <Double> consumo = new ArrayList <Double> ();
        DecimalFormat df = new DecimalFormat("###,##0.00");
        carros.add("Peugeot 208");
        consumo.add(16.9);
        carros.add("Ford Fiesta");
        consumo.add(14.2);
        carros.add("Citroën C-Elysée");
        consumo.add(26.3);
        carros.add("Renault Clio");
        consumo.add(15.8);
        carros.add("Honda HR-V");
        consumo.add(18.5);

        System.out.println(" ==== COMPARATIVO DE COMBUSTÍVEL ====");
        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo nº" + i);
            System.out.println("Nome: " + carros.get(i));
            System.out.println("Consumo km/l: " + consumo.get(i));
        }

        System.out.println("==== RELATÓRIO FINAL ====");
        for (int i = 0; i < 5; i++) {
            double consumoLitro = 1000 / consumo.get(i);
            double gasoline = consumoLitro *  2.25;
            System.out.println(i + " - " + carros.get(i) + " - " + consumo.get(i) + " - Litros " + df.format(consumoLitro) + " - Valor abastecido R$" + df.format(gasoline));
        
            if(consumo.get(i) > comparativo){
                comparativo = consumo.get(i);
                economico = i;
            }
        }
        System.out.println("O veículo com menor consumo é: " + carros.get(economico));
    }
}
