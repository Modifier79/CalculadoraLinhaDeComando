import java.util.Locale;
import java.util.Scanner;
public class CalculadoraSimples{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione a opção abaixo para calcular: \n" +
                "\t1-Somar\n\t2-Subtrair\n\t3-Multiplicar" +
                "\n\t4-Dividir");
        int opcaoSelecionada = entrada.nextInt();
        if(opcaoSelecionada == 1){
            System.out.println("Digite o primeiro número: \n");
            double adcaoPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo número: \n");
            double adcaoSegundo = entrada.nextDouble();
            double adcaoSoma = adcaoPrimeiro + adcaoSegundo;
            System.out.printf("Soma de %.2f + %.2f = %.2f %n", adcaoPrimeiro, adcaoSegundo, adcaoSoma );
        } else if(opcaoSelecionada == 2){
            System.out.println("Digite o primeiro número: \n");
            double subPrimero = entrada.nextDouble();
            System.out.println("Digite o segundo número: \n");
            double subSegundo = entrada.nextDouble();
            double subSoma = subPrimero - subSegundo;
            System.out.printf("Subtração de %.2f - %.2f = %.2f %n", subPrimero, subSegundo, subSoma );
        }else if(opcaoSelecionada == 3){
            System.out.println("Digite o primeiro número: \n");
            double multPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo número: \n");
            double multSegundo = entrada.nextDouble();
            double multSoma = multPrimeiro * multSegundo;
            System.out.printf("Multiplicação de %.2f X %.2f = %.2f ", multPrimeiro, multSegundo, multSoma);
        }else if(opcaoSelecionada == 4){
            System.out.println("Digite o primeiro número: \n");
            double divPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo número: \n");
            double divSegundo = entrada.nextDouble();
            double divSoma = divPrimeiro / divSegundo;
            System.out.printf("Divisão de %.2f / %.2f = %.2f %n", divPrimeiro, divSegundo, divSoma);
        }else{
            System.out.println("Opção invalida!");
        }
        entrada.close();
    }
}