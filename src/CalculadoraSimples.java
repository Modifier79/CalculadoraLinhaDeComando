import java.util.Locale;
import java.util.Scanner;
public class CalculadoraSimples{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione a op��o abaixo para calcular: \n" +
                "\t1-Somar\n\t2-Subtrair\n\t3-Multiplicar" +
                "\n\t4-Dividir");
        int opcaoSelecionada = entrada.nextInt();
        if(opcaoSelecionada == 1){
            System.out.println("Digite o primeiro n�mero: \n");
            double adcaoPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo n�mero: \n");
            double adcaoSegundo = entrada.nextDouble();
            double adcaoSoma = adcaoPrimeiro + adcaoSegundo;
            System.out.printf("Soma de %.2f + %.2f = %.2f %n", adcaoPrimeiro, adcaoSegundo, adcaoSoma );
        } else if(opcaoSelecionada == 2){
            System.out.println("Digite o primeiro n�mero: \n");
            double subPrimero = entrada.nextDouble();
            System.out.println("Digite o segundo n�mero: \n");
            double subSegundo = entrada.nextDouble();
            double subSoma = subPrimero - subSegundo;
            System.out.printf("Subtra��o de %.2f - %.2f = %.2f %n", subPrimero, subSegundo, subSoma );
        }else if(opcaoSelecionada == 3){
            System.out.println("Digite o primeiro n�mero: \n");
            double multPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo n�mero: \n");
            double multSegundo = entrada.nextDouble();
            double multSoma = multPrimeiro * multSegundo;
            System.out.printf("Multiplica��o de %.2f X %.2f = %.2f ", multPrimeiro, multSegundo, multSoma);
        }else if(opcaoSelecionada == 4){
            System.out.println("Digite o primeiro n�mero: \n");
            double divPrimeiro = entrada.nextDouble();
            System.out.println("Digite o segundo n�mero: \n");
            double divSegundo = entrada.nextDouble();
            double divSoma = divPrimeiro / divSegundo;
            System.out.printf("Divis�o de %.2f / %.2f = %.2f %n", divPrimeiro, divSegundo, divSoma);
        }else{
            System.out.println("Op��o invalida!");
        }
        entrada.close();
    }
}