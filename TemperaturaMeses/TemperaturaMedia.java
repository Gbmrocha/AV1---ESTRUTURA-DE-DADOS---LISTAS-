package TemperaturaMeses;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperaturaMedia {
    private static ArrayList <Double> temperatura = new ArrayList <Double>();

    public static void main(String[] args) {
        String[] mesesAno = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        double mediaAnual = 0.0;
        Scanner leitorDeTemperatura = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        System.out.println("Informe o ano: ");
        int ano = leitorDeTemperatura.nextInt();

        for (int i = 0; i < mesesAno.length; i++) {
            System.out.println("Informe a temperatura méida de " + mesesAno[i] + ": ");
            Double tempMes = leitorDeTemperatura.nextDouble();
            mediaAnual += tempMes;
            temperatura.add(tempMes);
        }
        leitorDeTemperatura.close();

        mediaAnual = mediaAnual/12;
        System.out.println("A temperatura média em " + ano + " foi de: " + df.format(mediaAnual));

        System.out.println("\nMeses em que a temperatura foi maior que a média anual:\n");
    
        for (int i = 0; i < temperatura.size(); i++) {
            if(temperatura.get(i) > mediaAnual){
                System.out.println(mesesAno[i] + " - " + temperatura.get(i) + "ºC");
            }
        }
    }
}
